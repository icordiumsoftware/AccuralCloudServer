package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.CustomResultDTO.KOTDTO;
import com.icordium.server.controller.CustomResultDTO.KOTItems;
import com.icordium.server.controller.CustomResultDTO.MenuInvoice;
import com.icordium.server.controller.CustomResultDTO.MenuInvoiceItems;
import com.icordium.server.controller.DataService.*;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.ReportService.KOTReportService;
import com.icordium.server.controller.ReportService.MenuSalesReportService;
import com.icordium.server.controller.ReportService.TableHeadOrderReportService;
import com.icordium.server.controller.datamodel.*;
import net.sf.jasperreports.engine.DefaultJasperReportsContext;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.export.*;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.fonts.InvalidFontException;
import net.sf.jasperreports.export.Exporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleHtmlExporterOutput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.web.util.WebHtmlResourceHandler;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.table.DefaultTableModel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.Vector;

@Service
public class ReportsServiceImpl implements ReportsService {
    @Autowired
    private DispatchRentOutedHedderService dispatchRentOutedHedderService;
    @Autowired
    private RentalInvoiceHeddderService rentalInvoiceHeddderService;
    @Autowired
    private RentalPriceListService rentalPriceListService;
    @Autowired
    private RentalBookingService rentalBookingService;
    @Autowired
    private StockService stockService;
    @Autowired
    private ResourceLoader resourceLoader;
    @Autowired
    private ProductHasMeniItemService productHasMeniItemService;
    @Autowired
    private MenuItemService menuItemService;
    // Report Service
    @Autowired
    private KOTReportService kotReportService;
    @Autowired
    private TableHeadOrderReportService orderReportService;
    @Autowired
    private MenuSalesReportService menuSalesReportService;

    @Override
    public byte[] MenuRecepieDetails(int id, ServletOutputStream inputstream, HttpServletRequest request) throws JRException, IOException, InvalidFontException {
        String jasperStream = resourceLoader.getResource("/resource/reports/menuitemwithrecipie.jrxml").getURI().getPath();
//        InputStream jasperStream = new FileInputStream(new File(request.getContextPath()+"/resource/reports/reports1.jrxml"));
        Map<String, Object> params = new HashedMap();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("COLLUMN_0");
        model.addColumn("COLLUMN_1");
        model.addColumn("COLLUMN_2");
        model.addColumn("COLLUMN_3");
        model.addColumn("COLLUMN_4");
        model.addColumn("COLLUMN_5");
        model.addColumn("COLLUMN_6");
        model.addColumn("COLLUMN_7");
        model.addColumn("COLLUMN_8");
        List<MenuitemEntity> allProductHasMeniItem = menuItemService.findAllMenuItem();

//        params.put("CompanyTittle",rentalinvoiceEntity.getLocationByLocationIdlocation().getCompanytittle()+"");
//        params.put("BranchEmail",rentalinvoiceEntity.getTransactionByTransactionIdtransaction().getLocationByLocationIdlocation().getAdress());
//
        for (MenuitemEntity entity : allProductHasMeniItem) {
            Vector vector = new Vector();
            vector.add(entity.getIdmenuitem() + "");
            vector.add(entity.getMenuitem() + "");
            vector.add(entity.getCostprice() + "");
            vector.add(entity.getSelligprice() + "");
            if (entity.getProductHasMenuitemsByIdmenuitem().size() > 0) {
                for (ProductHasMenuitemEntity menuitemEntity : entity.getProductHasMenuitemsByIdmenuitem()) {

                    vector.add(menuitemEntity.getProductIdproduct() + "");
                    vector.add(menuitemEntity.getProductByProductIdproduct().getProductcode());
                    vector.add(menuitemEntity.getProductByProductIdproduct().getDescription());
                    vector.add(menuitemEntity.getQty() + "");
                    model.addRow(vector);
                }
            } else {
                vector.add("");
                vector.add("");
                vector.add("");
                vector.add("");
                model.addRow(vector);
            }
        }

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperStream, params, new JRTableModelDataSource(model));

        final Exporter exporter;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();

        HtmlExporter htmlExporter = new HtmlExporter(DefaultJasperReportsContext.getInstance());
        HtmlResourceHandler imageHandler = new WebHtmlResourceHandler("http://localhost:8000/resource/reports/hedderpart.png");
        htmlExporter.setImageHandler(imageHandler);
        exporter = htmlExporter;
        exporter.setExporterOutput(new SimpleHtmlExporterOutput(out));
        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        exporter.exportReport();
        return out.toByteArray();
    }

    @Override
    public byte[] RentalInvoice(int id, ServletOutputStream inputstream, HttpServletRequest request) throws JRException, IOException, InvalidFontException {

        String jasperStream = resourceLoader.getResource("/resource/reports/reports1.jrxml").getURI().getPath();
//        InputStream jasperStream = new FileInputStream(new File(request.getContextPath()+"/resource/reports/reports1.jrxml"));
        Map<String, Object> params = new HashedMap();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("COLLUMN_0");
        model.addColumn("COLLUMN_1");
        model.addColumn("COLLUMN_2");
        model.addColumn("COLLUMN_3");
        model.addColumn("COLLUMN_4");
        model.addColumn("COLLUMN_5");
        model.addColumn("COLLUMN_6");
        model.addColumn("COLLUMN_7");
        model.addColumn("COLLUMN_8");
        RentalinvoiceEntity rentalinvoiceEntity = rentalInvoiceHeddderService.findById(id);
        params.put("InvoiceID", "" + id);
//        params.put("CompanyTittle","sasa");
        params.put("CompanyTittle", rentalinvoiceEntity.getLocationByLocationIdlocation().getCompanytittle() + "");
        params.put("BranchEmail", rentalinvoiceEntity.getTransactionByTransactionIdtransaction().getLocationByLocationIdlocation().getAdress());
        params.put("DateTime", new SimpleDateFormat("YYYY-MM-dd").format(rentalinvoiceEntity.getStartdate()) + " - " + new SimpleDateFormat("YYYY-MM-dd").format(rentalinvoiceEntity.getEnddate()));
        CustomersEntity customersEntity = rentalinvoiceEntity.getCustomersByCustomersIdcustomers();
        params.put("Customer", customersEntity.getSuffix() + " " + customersEntity.getFirstname() + " " + customersEntity.getLastname());
        params.put("Deposit", rentalinvoiceEntity.getAdvanceamount());
        params.put("DiliveryAddress", rentalinvoiceEntity.getRentoutedhedderByRentoutedhedderIdrentoutedhedder().getDiliveryaddress());

        params.put("CompanyIconPath", resourceLoader.getResource(rentalinvoiceEntity.getLocationByLocationIdlocation().getLogo()).getURI().getPath());
        params.put("heddericon", rentalinvoiceEntity.getLocationByLocationIdlocation().getReporthedder());
        params.put("footericon", resourceLoader.getResource(rentalinvoiceEntity.getLocationByLocationIdlocation().getReportfooter()).getURI().getPath());

        long diff = rentalinvoiceEntity.getEnddate().getTime() - rentalinvoiceEntity.getStartdate().getTime();
        long dates = diff / (24 * 60 * 60 * 1000);
        for (RentalinvoicedattaproductEntity entity : rentalinvoiceEntity.getRentalinvoicedattaproductsByIdrentalinvoice()) {
            Vector vector = new Vector();
            vector.add(entity.getProductIdproduct() + "");
            vector.add(entity.getProductByProductIdproduct().getDescription());

            vector.add(entity.getPrice() + "");
            vector.add(dates + "");
            vector.add(entity.getQty() + "");
            vector.add(entity.getFreeqty() + "");
            vector.add(entity.getDiscount() + "");
            vector.add(entity.getPrice() * dates * entity.getQty() - entity.getDiscount());
            vector.add("1");

            model.addRow(vector);
        }
        for (RentalservicedataEntity entity :
                rentalinvoiceEntity.getRentalservicedatasByIdrentalinvoice()) {
            Vector vector = new Vector();
            vector.add(entity.getServiceIdservice() + "");
            vector.add(entity.getServiceByServiceIdservice().getServicename());
            vector.add(entity.getServiceByServiceIdservice().getRetailprice() + "");
            vector.add("-");
            vector.add(entity.getQty() + "");
            vector.add(entity.getFreeqty() + "");
            vector.add(entity.getDiscount() + "");
            vector.add(entity.getPrice() * entity.getQty() - entity.getDiscount());
            vector.add("2");
            model.addRow(vector);
        }
        for (RentalinvoiceotherEntity entity :
                rentalinvoiceEntity.getRentalinvoiceothersByIdrentalinvoice()) {
            Vector vector = new Vector();
            vector.add(entity.getIdrentalinvoiceother() + "");
            vector.add(entity.getDescription());
            vector.add(entity.getPrice() + "");
            vector.add("-");
            vector.add(entity.getQty() + "");
            vector.add(entity.getFreeqty() + "");
            vector.add("-");
            vector.add(entity.getPrice() * entity.getQty() - entity.getDiscount());
            vector.add("3");
            model.addRow(vector);
        }

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperStream, params, new JRTableModelDataSource(model));

        final Exporter exporter;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();

        HtmlExporter htmlExporter = new HtmlExporter(DefaultJasperReportsContext.getInstance());
        HtmlResourceHandler imageHandler = new WebHtmlResourceHandler("http://localhost:8000/resource/reports/hedderpart.png");
        htmlExporter.setImageHandler(imageHandler);
        exporter = htmlExporter;
        exporter.setExporterOutput(new SimpleHtmlExporterOutput(out));
        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        exporter.exportReport();
        return out.toByteArray();
    }

    @Override
    public byte[] RentalOrder(int id, ServletOutputStream inputstream, HttpServletRequest request) throws JRException, IOException, InvalidFontException {
//        InputStream jasperStream = new FileInputStream(new File(request.getContextPath()+"/resource/reports/reports1.jrxml"));
        String jasperStream = resourceLoader.getResource("/resource/reports/reports1.jrxml").getURI().getPath();
        Map<String, Object> params = new HashedMap();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("COLLUMN_0");
        model.addColumn("COLLUMN_1");
        model.addColumn("COLLUMN_2");
        model.addColumn("COLLUMN_3");
        model.addColumn("COLLUMN_4");
        model.addColumn("COLLUMN_5");
        model.addColumn("COLLUMN_6");
        model.addColumn("COLLUMN_7");
        model.addColumn("COLLUMN_8");
        RentalbookingEntity rentalbookingEntity = rentalBookingService.findById(id);
        params.put("InvoiceID", "" + id);
        params.put("CompanyTittle", rentalbookingEntity.getLocationByLocationIdlocation().getCompanytittle() + "");
        params.put("BranchEmail", rentalbookingEntity.getLocationByLocationIdlocation().getAdress());
        params.put("DateTime", new SimpleDateFormat("YYYY-MM-dd").format(rentalbookingEntity.getDiliveerydate()) + " - " + new SimpleDateFormat("YYYY-MM-dd").format(rentalbookingEntity.getReturndate()));
        CustomersEntity customersEntity = rentalbookingEntity.getCustomersByCustomersIdcustomers();
        params.put("Customer", customersEntity.getSuffix() + " " + customersEntity.getFirstname() + " " + customersEntity.getLastname());
        params.put("Deposit", rentalbookingEntity.getAdvanceamount());
        params.put("DiliveryAddress", rentalbookingEntity.getDeliveryaddress());

        params.put("CompanyIconPath", resourceLoader.getResource(rentalbookingEntity.getLocationByLocationIdlocation().getLogo()).getURI().getPath());
        params.put("heddericon", resourceLoader.getResource(rentalbookingEntity.getLocationByLocationIdlocation().getReporthedder()).getURI().getPath());
        params.put("footericon", resourceLoader.getResource(rentalbookingEntity.getLocationByLocationIdlocation().getReportfooter()).getURI().getPath());

        long diff = rentalbookingEntity.getReturndate().getTime() - rentalbookingEntity.getDiliveerydate().getTime();
        long dates = diff / (24 * 60 * 60 * 1000);
        for (BookingproductEntity entity : rentalbookingEntity.getBookingproductsByIdrentalbooking()) {
            Vector vector = new Vector();
            vector.add(entity.getProductIdproduct() + "");
            vector.add(entity.getProductByProductIdproduct().getDescription());

            List<RentalpricelistEntity> entityList = rentalPriceListService.findAllRentalPriceByProductIdAndRentalPriceCategoryAndDateqty(entity.getProductIdproduct(), rentalbookingEntity.getRentalpricecategoryIdrentalpricecategory(), dates);
            if (entityList.size() >= 1) {
                vector.add(entityList.get(0).getRentalprice() + "");
                vector.add(dates + "");
                vector.add(entity.getQty() + "");
                vector.add(entity.getFreeqty() + "");
                vector.add(entity.getDiscount() + "");
                vector.add(entityList.get(0).getRentalprice() * dates * entity.getQty() - entity.getDiscount());
                vector.add("1");
            } else {
                vector.add("1010101010101010101010101010101");
                vector.add(dates + "");
                vector.add(entity.getQty() + "");
                vector.add(entity.getFreeqty() + "");
                vector.add(entity.getDiscount() + "");
                vector.add("1010101010101010101010101010101");
                vector.add("1");
            }
            model.addRow(vector);
        }
        for (BookingserviceEntity entity :
                rentalbookingEntity.getBookingservicesByIdrentalbooking()) {
            Vector vector = new Vector();
            vector.add(entity.getServiceIdservice() + "");
            vector.add(entity.getServiceByServiceIdservice().getServicename());
            vector.add(entity.getServiceByServiceIdservice().getRetailprice() + "");
            vector.add("-");
            vector.add(entity.getQty() + "");
            vector.add(entity.getFreeqty() + "");
            vector.add(entity.getDiscount() + "");
            vector.add(entity.getServiceByServiceIdservice().getRetailprice() * entity.getQty() - entity.getDiscount());
            vector.add("2");
            model.addRow(vector);
        }
        for (RentalotherEntity entity :
                rentalbookingEntity.getRentalothersByIdrentalbooking()) {
            Vector vector = new Vector();
            vector.add(entity.getIdrentalother() + "");
            vector.add(entity.getOtherdescription());
            vector.add(entity.getPrice() + "");
            vector.add("-");
            vector.add(entity.getQty() + "");
            vector.add(entity.getFreeqty() + "");
            vector.add("-");
            vector.add(entity.getPrice() * entity.getQty());
            vector.add("3");
            model.addRow(vector);
        }

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperStream, params, new JRTableModelDataSource(model));

        final Exporter exporter;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();

        HtmlExporter htmlExporter = new HtmlExporter(DefaultJasperReportsContext.getInstance());
        HtmlResourceHandler imageHandler = new WebHtmlResourceHandler("http://localhost:8000/resource/reports/hedderpart.png");
        htmlExporter.setImageHandler(imageHandler);
        exporter = htmlExporter;
        exporter.setExporterOutput(new SimpleHtmlExporterOutput(out));
        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        exporter.exportReport();
        return out.toByteArray();
    }

    @Override
    public byte[] RentalDispatchInvoice(int id, ServletOutputStream inputstream, HttpServletRequest request) throws JRException, IOException, InvalidFontException {
        String jasperStream = resourceLoader.getResource("/resource/reports/reports1.jasper").getURI().getPath();
        Map<String, Object> params = new HashedMap();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("COLLUMN_0");
        model.addColumn("COLLUMN_1");
        model.addColumn("COLLUMN_2");
        model.addColumn("COLLUMN_3");
        model.addColumn("COLLUMN_4");
        model.addColumn("COLLUMN_5");
        model.addColumn("COLLUMN_6");
        model.addColumn("COLLUMN_7");
        model.addColumn("COLLUMN_8");
        RentoutedhedderEntity rentoutedhedderEntity = dispatchRentOutedHedderService.findById(DataTypeValidator.parseInt(id));
        params.put("InvoiceID", "" + id);
        params.put("CompanyTittle", rentoutedhedderEntity.getLocationByLocationIdlocation().getCompanytittle() + "");
        params.put("BranchEmail", rentoutedhedderEntity.getLocationByLocationIdlocation().getAdress());
        params.put("DateTime", new SimpleDateFormat("YYYY-MM-dd").format(rentoutedhedderEntity.getDiliverydatetime()) + " - " + new SimpleDateFormat("YYYY-MM-dd").format(rentoutedhedderEntity.getReturndatetime()));
        CustomersEntity customersEntity = rentoutedhedderEntity.getCustomersByCustomersIdcustomers();
        params.put("Customer", customersEntity.getSuffix() + " " + customersEntity.getFirstname() + " " + customersEntity.getLastname());
        params.put("Deposit", rentoutedhedderEntity.getAdvanceamount());
        params.put("DiliveryAddress", rentoutedhedderEntity.getDiliveryaddress());

        params.put("CompanyIconPath", resourceLoader.getResource(rentoutedhedderEntity.getLocationByLocationIdlocation().getLogo()).getURI().getPath());
        params.put("heddericon", rentoutedhedderEntity.getLocationByLocationIdlocation().getReporthedder());
        params.put("footericon", resourceLoader.getResource(rentoutedhedderEntity.getLocationByLocationIdlocation().getReportfooter()).getURI().getPath());

        long diff = rentoutedhedderEntity.getReturndatetime().getTime() - rentoutedhedderEntity.getDiliverydatetime().getTime();
        long dates = diff / (24 * 60 * 60 * 1000);
        for (RentoutedproductdataEntity entity : rentoutedhedderEntity.getRentoutedproductdatasByIdrentoutedhedder()) {
            Vector vector = new Vector();
            vector.add(entity.getProductidproduct() + "");
            vector.add(entity.getProductByProductidproduct().getDescription());

            List<RentalpricelistEntity> entityList = rentalPriceListService.findAllRentalPriceByProductIdAndRentalPriceCategoryAndDateqty(entity.getProductidproduct(), rentoutedhedderEntity.getRentalpricecategoryIdrentalpricecategory(), dates);
            if (entityList.size() >= 1) {
                vector.add(entityList.get(0).getRentalprice() + "");
                vector.add(dates + "");
                vector.add(entity.getQty() + "");
                vector.add(entity.getFreeqty() + "");
                vector.add(entity.getDiscount() + "");
                vector.add(entityList.get(0).getRentalprice() * dates * entity.getQty() - entity.getDiscount());
                vector.add("1");
            } else {
                vector.add("1010101010101010101010101010101");
                vector.add(dates + "");
                vector.add(entity.getQty() + "");
                vector.add(entity.getFreeqty() + "");
                vector.add(entity.getDiscount() + "");
                vector.add("1010101010101010101010101010101");
                vector.add("1");
            }
            model.addRow(vector);
        }
        for (RentoutservicedataEntity entity :
                rentoutedhedderEntity.getRentoutservicedatasByIdrentoutedhedder()) {
            Vector vector = new Vector();
            vector.add(entity.getServiceIdservice() + "");
            vector.add(entity.getServiceByServiceIdservice().getServicename());
            vector.add(entity.getServiceByServiceIdservice().getRetailprice() + "");
            vector.add("-");
            vector.add(entity.getQty() + "");
            vector.add(entity.getFreeqty() + "");
            vector.add(entity.getDiscount() + "");
            vector.add(entity.getPrice() * entity.getQty() - entity.getDiscount());
            vector.add("2");
            model.addRow(vector);
        }
        for (RentoutedotherEntity entity :
                rentoutedhedderEntity.getRentoutedothersByIdrentoutedhedder()) {
            Vector vector = new Vector();
            vector.add(entity.getIdrentoutedother() + "");
            vector.add(entity.getDescription());
            vector.add(entity.getRate() + "");
            vector.add("-");
            vector.add(entity.getQty() + "");
            vector.add(entity.getFreeqty() + "");
            vector.add("-");
            vector.add(entity.getRate() * entity.getQty());
            vector.add("3");
            model.addRow(vector);
        }
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperStream, params, new JRTableModelDataSource(model));

        final Exporter exporter;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();

        HtmlExporter htmlExporter = new HtmlExporter(DefaultJasperReportsContext.getInstance());
        HtmlResourceHandler imageHandler = new WebHtmlResourceHandler("http://localhost:8000/resource/reports/hedderpart.png");
        htmlExporter.setImageHandler(imageHandler);
        exporter = htmlExporter;
        exporter.setExporterOutput(new SimpleHtmlExporterOutput(out));
        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        exporter.exportReport();
        return out.toByteArray();
    }

    @Override
    public byte[] KOT(String id, ServletOutputStream inputstream, HttpServletRequest request) throws JRException, IOException, InvalidFontException {
        String jasperStream = resourceLoader.getResource("/resource/reports/TICKETS.jrxml").getURI().getPath();
        Map<String, Object> params = new HashedMap();
        KOTDTO kotReportData = kotReportService.getKotReportData(id);
        boolean itshaveitems = false;

//        params.put("TPLINE", "047454-55");
//        params.put("Address", kotReportData.get);
        params.put("TableID", kotReportData.getTable());
        params.put("HeadID", kotReportData.getTableHeads());
        params.put("Cashier", kotReportData.getCashier());
        params.put("Employee", kotReportData.getEmployee());
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("COLLUMN_0");
        model.addColumn("COLLUMN_1");
        model.addColumn("COLLUMN_2");
        model.addColumn("COLLUMN_3");

        for (KOTItems kotItems : kotReportData.getKotItemss()) {

            if (kotItems.getOrderType() == 1) {
                itshaveitems = true;
                Vector v = new Vector();
                v.add(kotItems.getId());
                v.add(kotItems.getItemName());
                v.add(kotItems.getQty());
                v.add(kotItems.getQty());
                model.addRow(v);
            }
        }
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperStream, params, new JRTableModelDataSource(model));

        final Exporter exporter;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();

        HtmlExporter htmlExporter = new HtmlExporter(DefaultJasperReportsContext.getInstance());
        HtmlResourceHandler imageHandler = new WebHtmlResourceHandler("http://localhost:8000/resource/reports/hedderpart.png");
        htmlExporter.setImageHandler(imageHandler);
        exporter = htmlExporter;
        exporter.setExporterOutput(new SimpleHtmlExporterOutput(out));
        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        exporter.exportReport();
        return out.toByteArray();

    }

    @Override
    public byte[] headOrder(String id, ServletOutputStream inputstream, HttpServletRequest request) throws JRException, IOException, InvalidFontException {
        String jasperStream = resourceLoader.getResource("/resource/reports/MENUINVOICE.jrxml").getURI().getPath();
        MenuInvoice menuInvoiceOrderData = orderReportService.getMenuInvoiceData(id);
        Map<String, Object> params = new HashedMap();
        params.put("Address", menuInvoiceOrderData.getAddress());
        if (menuInvoiceOrderData.getTotal() > 0) {
            params.put("Total", menuInvoiceOrderData.getTotal());
        }
        if (menuInvoiceOrderData.getTendered() > 0) {
            params.put("Tendered", menuInvoiceOrderData.getTendered());
        }
        if (menuInvoiceOrderData.getDue() > 0) {
            params.put("Due", menuInvoiceOrderData.getDue());
        }
        params.put("CurrencyType", menuInvoiceOrderData.getCurrencyType());
        params.put("TableID", menuInvoiceOrderData.getTableID());
        params.put("TPLINE", menuInvoiceOrderData.getTPLINE());
        params.put("tableID", menuInvoiceOrderData.getTableID());
        params.put("Employee", menuInvoiceOrderData.getEmployee());
        if (menuInvoiceOrderData.getPaid() > 0) {
            params.put("Paid", menuInvoiceOrderData.getPaid());
        }
        params.put("SubTotal", menuInvoiceOrderData.getSubTotal());
        params.put("HeadID", menuInvoiceOrderData.getHeadID());
        params.put("Cashier", menuInvoiceOrderData.getCashier());
        params.put("LogoStatus", menuInvoiceOrderData.getLogoStatus());
        params.put("InvoiceTypeName", menuInvoiceOrderData.getInvoiceTypeName());
        params.put("logo", menuInvoiceOrderData.getLogo());

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("COLLUMN_0");
        model.addColumn("COLLUMN_1");
        model.addColumn("COLLUMN_2");
        model.addColumn("COLLUMN_3");


        for (MenuInvoiceItems menuInvoiceItems : menuInvoiceOrderData.getInvoiceItemsList()) {
            Vector v = new Vector();
            v.add(menuInvoiceItems.getId());
            v.add(menuInvoiceItems.getItemName());
            v.add(menuInvoiceItems.getQty());
            v.add(menuInvoiceItems.getRowtotal());
            model.addRow(v);
        }

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperStream, params, new JRTableModelDataSource(model));

        final Exporter exporter;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();

        HtmlExporter htmlExporter = new HtmlExporter(DefaultJasperReportsContext.getInstance());
        HtmlResourceHandler imageHandler = new WebHtmlResourceHandler("http://localhost:8000/resource/reports/hedderpart.png");
        htmlExporter.setImageHandler(imageHandler);
        exporter = htmlExporter;
        exporter.setExporterOutput(new SimpleHtmlExporterOutput(out));
        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        exporter.exportReport();
        return out.toByteArray();
    }

    @Override
    public byte[] MenuInvoice(String id, ServletOutputStream inputstream, HttpServletRequest request) throws JRException, IOException, InvalidFontException {
        String jasperStream = resourceLoader.getResource("/resource/reports/MENUINVOICE.jrxml").getURI().getPath();
        MenuInvoice menuInvoiceData = menuSalesReportService.getMenuInvoiceData(id);
        Map<String, Object> params = new HashedMap();
        params.put("Address", menuInvoiceData.getAddress());
        if (menuInvoiceData.getTotal() > 0) {
            params.put("Total", menuInvoiceData.getTotal());
        }
        if (menuInvoiceData.getTendered() > 0) {
            params.put("Tendered", menuInvoiceData.getTendered());
        }
        if (menuInvoiceData.getDue() > 0) {
            params.put("Due", menuInvoiceData.getDue());
        }
        params.put("CurrencyType", menuInvoiceData.getCurrencyType());
        params.put("TableID", menuInvoiceData.getTableID());
        params.put("TPLINE", menuInvoiceData.getTPLINE());
        params.put("tableID", menuInvoiceData.getTableID());
        params.put("Employee", menuInvoiceData.getEmployee());
        if (menuInvoiceData.getPaid() > 0) {
            params.put("Paid", menuInvoiceData.getPaid());
        }
        params.put("SubTotal", menuInvoiceData.getSubTotal());
        params.put("HeadID", menuInvoiceData.getHeadID());
        params.put("Cashier", menuInvoiceData.getCashier());
        params.put("LogoStatus", menuInvoiceData.getLogoStatus());
        params.put("InvoiceTypeName", menuInvoiceData.getInvoiceTypeName());
        params.put("logo", menuInvoiceData.getLogo());

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("COLLUMN_0");
        model.addColumn("COLLUMN_1");
        model.addColumn("COLLUMN_2");
        model.addColumn("COLLUMN_3");


        for (MenuInvoiceItems menuInvoiceItems : menuInvoiceData.getInvoiceItemsList()) {
            Vector v = new Vector();
            v.add(menuInvoiceItems.getId());
            v.add(menuInvoiceItems.getItemName());
            v.add(menuInvoiceItems.getQty());
            v.add(menuInvoiceItems.getRowtotal());
            model.addRow(v);
        }

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperStream, params, new JRTableModelDataSource(model));

        final Exporter exporter;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();

        HtmlExporter htmlExporter = new HtmlExporter(DefaultJasperReportsContext.getInstance());
        HtmlResourceHandler imageHandler = new WebHtmlResourceHandler("http://localhost:8000/resource/reports/hedderpart.png");
        htmlExporter.setImageHandler(imageHandler);
        exporter = htmlExporter;
        exporter.setExporterOutput(new SimpleHtmlExporterOutput(out));
        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        exporter.exportReport();
        return out.toByteArray();
    }

    @Override
    public byte[] Test(String id, HttpServletRequest request, HttpServletResponse httpServletResponse,String fileformat) throws JRException, IOException, InvalidFontException {
        String jasperStream = resourceLoader.getResource("/resource/reports/reports1.jasper").getURI().getPath();
        Map<String, Object> params = new HashedMap();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("COLLUMN_0");
        model.addColumn("COLLUMN_1");
        model.addColumn("COLLUMN_2");
        model.addColumn("COLLUMN_3");
        model.addColumn("COLLUMN_4");
        model.addColumn("COLLUMN_5");
        model.addColumn("COLLUMN_6");
        model.addColumn("COLLUMN_7");
        model.addColumn("COLLUMN_8");
        RentoutedhedderEntity rentoutedhedderEntity = dispatchRentOutedHedderService.findById(DataTypeValidator.parseInt(id));
        params.put("InvoiceID", "" + id);
        params.put("CompanyTittle", rentoutedhedderEntity.getLocationByLocationIdlocation().getCompanytittle() + "");
        params.put("BranchEmail", rentoutedhedderEntity.getLocationByLocationIdlocation().getAdress());
        params.put("DateTime", new SimpleDateFormat("YYYY-MM-dd").format(rentoutedhedderEntity.getDiliverydatetime()) + " - " + new SimpleDateFormat("YYYY-MM-dd").format(rentoutedhedderEntity.getReturndatetime()));
        CustomersEntity customersEntity = rentoutedhedderEntity.getCustomersByCustomersIdcustomers();
        params.put("Customer", customersEntity.getSuffix() + " " + customersEntity.getFirstname() + " " + customersEntity.getLastname());
        params.put("Deposit", rentoutedhedderEntity.getAdvanceamount());
        params.put("DiliveryAddress", rentoutedhedderEntity.getDiliveryaddress());

        params.put("CompanyIconPath", resourceLoader.getResource(rentoutedhedderEntity.getLocationByLocationIdlocation().getLogo()).getURI().getPath());
        params.put("heddericon", rentoutedhedderEntity.getLocationByLocationIdlocation().getReporthedder());
        params.put("footericon", resourceLoader.getResource(rentoutedhedderEntity.getLocationByLocationIdlocation().getReportfooter()).getURI().getPath());

        long diff = rentoutedhedderEntity.getReturndatetime().getTime() - rentoutedhedderEntity.getDiliverydatetime().getTime();
        long dates = diff / (24 * 60 * 60 * 1000);
        for (RentoutedproductdataEntity entity : rentoutedhedderEntity.getRentoutedproductdatasByIdrentoutedhedder()) {
            Vector vector = new Vector();
            vector.add(entity.getProductidproduct() + "");
            vector.add(entity.getProductByProductidproduct().getDescription());

            List<RentalpricelistEntity> entityList = rentalPriceListService.findAllRentalPriceByProductIdAndRentalPriceCategoryAndDateqty(entity.getProductidproduct(), rentoutedhedderEntity.getRentalpricecategoryIdrentalpricecategory(), dates);
            if (entityList.size() >= 1) {
                vector.add(entityList.get(0).getRentalprice() + "");
                vector.add(dates + "");
                vector.add(entity.getQty() + "");
                vector.add(entity.getFreeqty() + "");
                vector.add(entity.getDiscount() + "");
                vector.add(entityList.get(0).getRentalprice() * dates * entity.getQty() - entity.getDiscount());
                vector.add("1");
            } else {
                vector.add("1010101010101010101010101010101");
                vector.add(dates + "");
                vector.add(entity.getQty() + "");
                vector.add(entity.getFreeqty() + "");
                vector.add(entity.getDiscount() + "");
                vector.add("1010101010101010101010101010101");
                vector.add("1");
            }
            model.addRow(vector);
        }
        for (RentoutservicedataEntity entity :
                rentoutedhedderEntity.getRentoutservicedatasByIdrentoutedhedder()) {
            Vector vector = new Vector();
            vector.add(entity.getServiceIdservice() + "");
            vector.add(entity.getServiceByServiceIdservice().getServicename());
            vector.add(entity.getServiceByServiceIdservice().getRetailprice() + "");
            vector.add("-");
            vector.add(entity.getQty() + "");
            vector.add(entity.getFreeqty() + "");
            vector.add(entity.getDiscount() + "");
            vector.add(entity.getPrice() * entity.getQty() - entity.getDiscount());
            vector.add("2");
            model.addRow(vector);
        }
        for (RentoutedotherEntity entity :
                rentoutedhedderEntity.getRentoutedothersByIdrentoutedhedder()) {
            Vector vector = new Vector();
            vector.add(entity.getIdrentoutedother() + "");
            vector.add(entity.getDescription());
            vector.add(entity.getRate() + "");
            vector.add("-");
            vector.add(entity.getQty() + "");
            vector.add(entity.getFreeqty() + "");
            vector.add("-");
            vector.add(entity.getRate() * entity.getQty());
            vector.add("3");
            model.addRow(vector);
        }
//        JasperReport report = JasperCompileManager.compileReport(jasperStream);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperStream, params, new JRTableModelDataSource(model));

//        JasperExportManager.exportReportToHtmlFile(jasperPrint, "ssds.html");

//        HtmlExporter htmlExporter = new HtmlExporter(DefaultJasperReportsContext.getInstance());
//        HtmlResourceHandler imageHandler = new WebHtmlResourceHandler("http://localhost:8000/resource/reports/hedderpart.png");
//
//        htmlExporter.setImageHandler(imageHandler);
//        htmlExporter.setFontHandler(new WebHtmlResourceHandler("http://localhost:8000/resource/Font/iskolepota.ttf"));
//        htmlExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
//        htmlExporter.setExporterOutput(new SimpleHtmlExporterOutput(httpServletResponse.getWriter()));
//        htmlExporter.exportReport();
//        return httpServletResponse;
        final Exporter exporter;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        boolean html = false;

        switch (fileformat) {
            case "HTML":

                HtmlExporter htmlExporter = new HtmlExporter(DefaultJasperReportsContext.getInstance());
       HtmlResourceHandler imageHandler = new WebHtmlResourceHandler("http://localhost:8000/resource/reports/hedderpart.png");
                htmlExporter.setImageHandler(imageHandler);
                exporter = htmlExporter;
                exporter.setExporterOutput(new SimpleHtmlExporterOutput(out));
//
                html = true;
                break;

            case "CSV":
                exporter = new JRCsvExporter();
                break;

            case "XML":
                exporter = new JRXmlExporter();
                break;

            case "XLSX":
                exporter = new JRXlsxExporter();
                break;

            case "PDF":
                exporter = new JRPdfExporter();
                break;

            default:
                throw new JRException("Unknown report format: " + fileformat.toString());
        }

        if (!html) {
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(out));
        }

        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        exporter.exportReport();
        return out.toByteArray();
    }
}