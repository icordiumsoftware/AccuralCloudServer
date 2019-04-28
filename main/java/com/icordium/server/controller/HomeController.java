package com.icordium.server.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.icordium.server.controller.CustomResultDTO.RentalInvoiceingCreatingRequest;
import com.icordium.server.controller.DataService.*;
import com.icordium.server.controller.datamodel.RentoutedhedderEntity;
import com.icordium.server.controller.datamodel.WorkshiftEntity;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.fonts.InvalidFontException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

/**
 * Created By
 *
 * @author Icordium
 * @date 10/19/18
 * @project TestBootWar
 */
@RestController
@RequestMapping("/")
public class HomeController {

    /**
     * Created by ISH on 10/15/2018.
     */
    @Autowired
    private ProductTypeService productTypeService;
    @Autowired
    private LocationService locationService;
    @Autowired
    private ProductService productService;
    @Autowired
    private RentalPriceCategoryService rentalPriceCategoryService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ServiceService serviceService;
    @Autowired
    private DispatchRentOutedHedderService dispatchRentOutedHedderService;
    @Autowired
    private RentalPriceListService rentalPriceListService;
    @Autowired
    private RentalInvoiceHeddderService rentalInvoiceHeddderService;
    @Autowired
    private SalesHedderService salesHedderService;
    @Autowired
    private RentalBookingService rentalBookingService;
    @Autowired
    private StockService stockService;
    @Autowired
    private ReportsService reportsService;
    @Autowired
    private WorkPeriodService workPeriodService;
    @Autowired
    private SalaryAdvanceService salaryAdvanceService;
    @Autowired
    private GoodReciveHedderService goodReciveHedderService;
    @Autowired
    private MenuSalesInvoiceService menuSalesInvoiceService;


    @RequestMapping("version")
    public String version() {
        return "TestBootWar 1.0v";
    }


    @RequestMapping("/hello")
    public String hello(HttpServletRequest httpServletRequest, Model model) {
        model.addAttribute("mod", "ishan");
        return "hello";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView defaultMethod(HttpServletRequest httpServletRequest, Model model, @RequestHeader(value = "Accept-Language") String Language) {
        model.addAttribute("mod", "ishan");
        return new ModelAndView("default");
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView userLoginPage(HttpServletRequest httpServletRequest, Model model) {
        model.addAttribute("locations", locationService.findAllActiveLocation(1));
        model.addAttribute("mod", "ishan");
        return new ModelAndView("login");

    }

    @RequestMapping(value = "/loginout", method = RequestMethod.GET)
    public ModelAndView userLoginOutPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("redirect:login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("redirect:login");
        }
        model.addAttribute("locations", locationService.findAllActiveLocation(1));
        httpServletRequest.getSession().invalidate();
        return new ModelAndView("redirect:login");
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public ModelAndView productPage(HttpServletRequest httpServletReques, Model model) {
        try {
            if (httpServletReques.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("redirect:login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("redirect:login");
        }
        model.addAttribute("dataList", productService.findAllProducts());
        model.addAttribute("TypeList", productTypeService.findAllActiveProductType());
        return new ModelAndView("productPage");
    }

    @RequestMapping(value = "/GoodTransferNote", method = RequestMethod.GET)
    public ModelAndView GoodTransferNotePage(HttpServletRequest httpServletReques, Model model) {
        try {
            if (httpServletReques.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("redirect:login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("redirect:login");
        }
        model.addAttribute("dataList", productService.findAllProducts());
        model.addAttribute("locations", locationService.findAllActiveLocation(1));
        model.addAttribute("products", productService.findAllProducts());
        model.addAttribute("TypeList", productTypeService.findAllActiveProductType());
        return new ModelAndView("GoodTransferNote");
    }

    @RequestMapping(value = "/GoodRecieveNote", method = RequestMethod.GET)
    public ModelAndView GoodRecieveNotePage(HttpServletRequest httpServletReques, Model model) {
        try {
            if (httpServletReques.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("redirect:login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("redirect:login");
        }
        model.addAttribute("dataList", productService.findAllProducts());
        model.addAttribute("draftlist", goodReciveHedderService.findAllActiveGoodReciveHedder(0));
        model.addAttribute("locations", locationService.findAllActiveLocation(1));
        model.addAttribute("products", productService.findAllProducts());
        model.addAttribute("TypeList", productTypeService.findAllActiveProductType());
        return new ModelAndView("GRN");
    }

    @RequestMapping(value = "/productCategory", method = RequestMethod.GET)
    public ModelAndView productCategoryPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("redirect:login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("redirect:login");
        }
        model.addAttribute("dataList", productTypeService.findAllProductType());
        return new ModelAndView("productType");
    }

    @RequestMapping(value = "/productrentalprice", method = RequestMethod.GET)
    public ModelAndView productRentalPricePage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("redirect:login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("redirect:login");
        }
        model.addAttribute("dataList", rentalPriceCategoryService.findAllRentalPriceCategory());
        return new ModelAndView("RentalProductPricePage");
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ModelAndView customerPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("redirect:login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("redirect:login");
        }
        model.addAttribute("dataList", customerService.findAllCustomer());
        return new ModelAndView("customerPage");
    }

    @RequestMapping(value = "/LocationStockSummery", method = RequestMethod.GET)
    public ModelAndView StockSummeryPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("redirect:login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("redirect:login");
        }
        model.addAttribute("dataList", stockService.findAllStock());
        return new ModelAndView("StockSummery");
    }

    @RequestMapping(value = "/camera", method = RequestMethod.GET)
    public ModelAndView cameraPage(HttpServletRequest httpServletRequest, Model model) {
        // model.addAttribute("dataList",customerService.findAllCustomer());
        return new ModelAndView("CameraPage");
    }

    @RequestMapping(value = "/service", method = RequestMethod.GET)
    public ModelAndView ServicePage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("redirect:login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("redirect:login");
        }
        // model.addAttribute("dataList",customerService.findAllCustomer());
        return new ModelAndView("ServicePage");
    }

    @RequestMapping(value = "/DailyProductBookingSummery", method = RequestMethod.GET)
    public ModelAndView DailyProductBookingSummeryPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("redirect:login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("redirect:login");
        }
        // model.addAttribute("dataList",customerService.findAllCustomer());
        return new ModelAndView("DailyProductBookingSummeryPage");
    }

    @RequestMapping(value = "/rentalbook", method = RequestMethod.GET)
    public ModelAndView RentalBookingPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        // model.addAttribute("dataList",customerService.findAllCustomer());
        return new ModelAndView("RentalBooking");
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView EmployeePage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        // model.addAttribute("dataList",customerService.findAllCustomer());
        return new ModelAndView("EmployeePage");
    }

    @RequestMapping(value = "/salaryadvance", method = RequestMethod.GET)
    public ModelAndView EmployeesalaryAdvancePage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        model.addAttribute("dataList", salaryAdvanceService.findAllSalaryAdvanceByWorkPeriod(DataTypeValidator.parseInt(httpServletRequest.getSession().getAttribute("WorkShiftID"))));
        model.addAttribute("EMPdataList", employeeService.findAllEmployee());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.now();
        model.addAttribute("currentDate", dtf.format(localDate));
        return new ModelAndView("SalaryAdvancePage");
    }

    @RequestMapping(value = "/cashinout", method = RequestMethod.GET)
    public ModelAndView CashInOutPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        model.addAttribute("dataList", workPeriodService.findById(DataTypeValidator.parseInt(httpServletRequest.getSession().getAttribute("WorkShiftID"))).getCashinandcashoutsByIdworkshift());
        return new ModelAndView("CashInOutPage");
    }

    @RequestMapping(value = "/rentbooking", method = RequestMethod.GET)
    public ModelAndView RentBookingPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        // model.addAttribute("dataList",customerService.findAllCustomer());
        return new ModelAndView("RentBookingPage");
    }

    @RequestMapping(value = "/pendingrentbookingorders", method = RequestMethod.GET)
    public ModelAndView PendingRentBookingPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        model.addAttribute("dataList", rentalBookingService.findAllByStatus(1));
        return new ModelAndView("rentalbookinngpendinglist");
    }

    @RequestMapping(value = "/rentitemview", method = RequestMethod.GET)
    public ModelAndView RentItemviewPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        // model.addAttribute("dataList",customerService.findAllCustomer());
        return new ModelAndView("RentItemView");
    }

    @RequestMapping(value = "/PendingRentalInvoice", method = RequestMethod.GET)
    public ModelAndView PendingRentalInvoicePage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        int locationID = DataTypeValidator.parseInt(httpServletRequest.getSession().getAttribute("LocationID"));
        if (locationID > 0) {
            ArrayList<RentoutedhedderEntity> entityList = (ArrayList<RentoutedhedderEntity>) dispatchRentOutedHedderService.findAllPendingRentoutedhedders(1, locationID);
            entityList.sort(new Comparator<RentoutedhedderEntity>() {
                @Override
                public int compare(RentoutedhedderEntity o1, RentoutedhedderEntity o2) {
                    return (int) (o1.getRegdatetime().getTime() - o2.getReturndatetime().getTime());
                }
            });
            model.addAttribute("dataList", entityList);
        }
        return new ModelAndView("PendingRentalInvoicePage");
    }

    @RequestMapping(value = "/RentalReceiveInvoice", method = RequestMethod.GET)
    public ModelAndView ReceiveRentalInvoicePage(HttpServletRequest httpServletRequest, Model model, @RequestParam int id) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        System.out.println("Recive Id" + id);
        ModelAndView modelAndView = new ModelAndView("ReceiveRentalInvoicePage");
        modelAndView.addObject("id", id);
        return modelAndView;
    }

    @RequestMapping(value = "/location", method = RequestMethod.GET)
    public ModelAndView LocationPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        model.addAttribute("dataList", locationService.findAllLocation());
        return new ModelAndView("LocationPage");
    }

    @RequestMapping(value = "/CounterClose", method = RequestMethod.GET)
    public ModelAndView CounterClosePage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        model.addAttribute("data", workPeriodService.findById(DataTypeValidator.parseInt(httpServletRequest.getSession().getAttribute("WorkShiftID"))));
        return new ModelAndView("CounterClose");
    }

    @RequestMapping(value = "/tableslist", method = RequestMethod.GET)
    public ModelAndView TablesPage(HttpServletRequest httpServletRequest, Model model, @RequestParam(value = "orderid", required = false, defaultValue = "0") String orderid) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        ModelAndView modelAndView = new ModelAndView("resturant/Tables");
        modelAndView.addObject("orderid", StringUtils.isEmpty(orderid) ? "0" : orderid);
        return modelAndView;
    }

    @RequestMapping(value = "/menusettings", method = RequestMethod.GET)
    public ModelAndView FloorPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        return new ModelAndView("resturant/ChangeDetails");
    }

    @RequestMapping(value = "/dineininvoice", method = RequestMethod.GET)
    public ModelAndView DineInInvoicePage(HttpServletRequest httpServletRequest, Model model, @RequestParam("t") Integer id, @RequestParam("head") Integer head, @RequestParam("tname") String tname) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        ModelAndView modelAndView = new ModelAndView("resturant/DineInInvoicePage");
        modelAndView.addObject("t", id);
        modelAndView.addObject("head", head);
        modelAndView.addObject("tname", tname);
        return modelAndView;
    }

    @RequestMapping(value = "/dineininvoicepayment", method = RequestMethod.GET)
    public ModelAndView DineInInvoicepaymentPage(HttpServletRequest httpServletRequest, Model model, @RequestParam("t") Integer id, @RequestParam("head") Integer head, @RequestParam("tname") String tname, @RequestParam("orderid") String orderid) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        ModelAndView modelAndView = new ModelAndView("resturant/DineInInvoicePaymentPage");
        modelAndView.addObject("t", id);
        modelAndView.addObject("head", head);
        modelAndView.addObject("tname", tname);
        modelAndView.addObject("orderid", orderid);
        return modelAndView;
    }

    @RequestMapping(value = "/daysummery", method = RequestMethod.GET)
    public ModelAndView DaySummeryPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        model.addAttribute("startdate", format.format(DataGenerator.getFirstDateOfCurrentMonth()));
        model.addAttribute("enddate", format.format(new Date()));
        return new ModelAndView("DaySummeryPage");
    }
    @RequestMapping(value = "/rentaldaysummery", method = RequestMethod.GET)
    public ModelAndView rentalDaySummeryPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("login");
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        model.addAttribute("startdate", format.format(DataGenerator.getFirstDateOfCurrentMonth()));
        model.addAttribute("enddate", format.format(new Date()));
        return new ModelAndView("rental/RentalDaySummery");
    }

    @RequestMapping(value = "/counterCloseByUser/{floatval}/{cashinhand}", method = RequestMethod.GET)
    public ModelAndView counterclose(HttpServletRequest httpServletRequest, Model model, @PathVariable("floatval") String flaotval, @PathVariable("cashinhand") String cashinhand) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("redirect:login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("redirect:login");
        }
        WorkshiftEntity workshiftEntity = workPeriodService.findById(DataTypeValidator.parseInt(httpServletRequest.getSession().getAttribute("WorkShiftID")));
        workshiftEntity.setEnd(new Timestamp(new Date().getTime()));
        workshiftEntity.setCashinhand(DataTypeValidator.parseDouble(cashinhand));
        workshiftEntity.setFloatval(DataTypeValidator.parseDouble(flaotval));
        workPeriodService.updateWorkshift(workshiftEntity);
        model.addAttribute("locations", locationService.findAllActiveLocation(1));
        httpServletRequest.getSession().invalidate();
        return new ModelAndView("redirect:login");
    }

    @RequestMapping(value = "/RentalDispatchInvoice/{id}", method = RequestMethod.GET)
    @ResponseBody
    public void getRpt1(@PathVariable("id") int id, HttpServletResponse response, HttpServletRequest request) throws JRException, IOException, InvalidFontException {
        try {
            ServletOutputStream servletOutputStream = response.getOutputStream();
            if (!request.getSession().getAttribute("userid").equals(null)) {
                response.setContentType("text/html");
                byte[] exportReportToPdf = reportsService.RentalDispatchInvoice(id, servletOutputStream, request);
 					response.setContentLength(exportReportToPdf.length);
                servletOutputStream.write(exportReportToPdf, 0, exportReportToPdf.length);
                servletOutputStream.flush();
                servletOutputStream.close();

            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/RentalOrder/{id}", method = RequestMethod.GET)
    @ResponseBody
    public void getRentBookingOrder(@PathVariable("id") int id, HttpServletResponse response, HttpServletRequest request) throws JRException, IOException, InvalidFontException {
        ServletOutputStream servletOutputStream = response.getOutputStream();
        try {
            if (!request.getSession().getAttribute("userid").equals(null)) {
                response.setContentType("text/html");
                byte[] exportReportToPdf = reportsService.RentalOrder(id, servletOutputStream, request);
                response.setContentLength(exportReportToPdf.length);
                servletOutputStream.write(exportReportToPdf, 0, exportReportToPdf.length);
                servletOutputStream.flush();
                servletOutputStream.close();

            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/RentalInvoice/{id}", method = RequestMethod.GET)
    @ResponseBody
    public void getRenta1Invoice(@PathVariable("id") int id, HttpServletResponse response, HttpServletRequest request) throws JRException, IOException, InvalidFontException {
        ServletOutputStream servletOutputStream = response.getOutputStream();
        try {
            if (!request.getSession().getAttribute("userid").equals(null)) {
                byte[] exportReportToPdf = reportsService.RentalInvoice(id, servletOutputStream, request);
                response.setContentType("text/html");
                response.setContentLength(exportReportToPdf.length);
                servletOutputStream.write(exportReportToPdf, 0, exportReportToPdf.length);
                servletOutputStream.flush();
                servletOutputStream.close();

            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/MenuItemsRecipes", method = RequestMethod.GET)
    @ResponseBody
    public void getMenuReceipeDetails(HttpServletResponse response, HttpServletRequest request) throws JRException, IOException, InvalidFontException {
        ServletOutputStream servletOutputStream = response.getOutputStream();
        try {
            if (!request.getSession().getAttribute("userid").equals(null)) {
                byte[] exportReportToPdf = reportsService.MenuRecepieDetails(1, servletOutputStream, request);
                response.setContentType("text/html");
                response.setContentLength(exportReportToPdf.length);
                servletOutputStream.write(exportReportToPdf, 0, exportReportToPdf.length);
                servletOutputStream.flush();
                servletOutputStream.close();

            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public ModelAndView dashboardIndexPage(HttpServletRequest httpServletRequest, Model model) {
        try {
            if (httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("redirect:login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("redirect:login");
        }
        model.addAttribute("productCount", productService.productCount());
        model.addAttribute("employeeCount", employeeService.employeeCount());
        model.addAttribute("rentProductCount", productService.productCountByRentStatus(1));
        model.addAttribute("CustomerCount", customerService.count(1));
        model.addAttribute("ServiceCount", serviceService.count());
        model.addAttribute("SalesInvoiceCount", salesHedderService.SalesHedderCount());
        model.addAttribute("RentBookingcount", rentalBookingService.count());
        model.addAttribute("PendingRentInvoiceCount", dispatchRentOutedHedderService.pendingRentalcount());
        model.addAttribute("StockZeroCount", stockService.countZeroStock());
        model.addAttribute("StockListCount", stockService.count());
        model.addAttribute("RentalInvoiceCount", rentalInvoiceHeddderService.count());
        model.addAttribute("MenusaleInvoiceCount", menuSalesInvoiceService.count());
        return new ModelAndView("dashBoard");
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView dashboardPage(HttpServletRequest request, Model model) {
        try {
            if (request.getSession().getAttribute("userid").equals(null)) {
                model.addAttribute("locations", locationService.findAllActiveLocation(1));
                return new ModelAndView("redirect:login");
            }
        } catch (NullPointerException e) {
            model.addAttribute("locations", locationService.findAllActiveLocation(1));
            return new ModelAndView("redirect:login");
        }
        model.addAttribute("productCount", productService.productCount());
        model.addAttribute("employeeCount", employeeService.employeeCount());
        model.addAttribute("rentProductCount", productService.productCountByRentStatus(1));
        model.addAttribute("CustomerCount", customerService.count(1));
        model.addAttribute("ServiceCount", serviceService.count());
        model.addAttribute("SalesInvoiceCount", salesHedderService.SalesHedderCount());
        model.addAttribute("RentBookingcount", rentalBookingService.count());
        model.addAttribute("PendingRentInvoiceCount", dispatchRentOutedHedderService.pendingRentalcount());
        model.addAttribute("StockZeroCount", stockService.countZeroStock());
        model.addAttribute("StockListCount", stockService.count());
        model.addAttribute("RentalInvoiceCount", rentalInvoiceHeddderService.count());
        model.addAttribute("MenusaleInvoiceCount", menuSalesInvoiceService.count());
        return new ModelAndView("dashBoard");
    }

    @RequestMapping("/kot/{orderid}")
    @ResponseBody
    public void allTablesHeadsOrderbyheadidandstatus(@PathVariable(value = "orderid") String orderid, HttpServletResponse response, HttpServletRequest request) throws JRException, IOException, InvalidFontException {
        ServletOutputStream servletOutputStream = response.getOutputStream();
        try {
            if (!request.getSession().getAttribute("userid").equals(null)) {
                byte[] exportReportToPdf = reportsService.KOT(orderid, servletOutputStream, request);
                response.setContentType("text/html");
                response.setContentLength(exportReportToPdf.length);
                servletOutputStream.write(exportReportToPdf, 0, exportReportToPdf.length);
                servletOutputStream.flush();
                servletOutputStream.close();

            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/headorderdata/{tableheadid}")
    @ResponseBody
    public void TableHeadPendingAllOrderData(@PathVariable(value = "tableheadid") String tableheadid, HttpServletResponse response, HttpServletRequest request) throws JRException, IOException, InvalidFontException {
        ServletOutputStream servletOutputStream = response.getOutputStream();
        try {
            if (!request.getSession().getAttribute("userid").equals(null)) {
                byte[] exportReportToPdf = reportsService.headOrder(tableheadid, servletOutputStream, request);
                response.setContentType("text/html");
                response.setContentLength(exportReportToPdf.length);
                servletOutputStream.write(exportReportToPdf, 0, exportReportToPdf.length);
                servletOutputStream.flush();
                servletOutputStream.close();

            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/menuinvoice/{menuinvoiceid}")
    @ResponseBody
    public void MenuInvoiceData(@PathVariable(value = "menuinvoiceid") String tableheadid, HttpServletResponse response, HttpServletRequest request) throws JRException, IOException, InvalidFontException {
        ServletOutputStream servletOutputStream = response.getOutputStream();
        try {
            if (!request.getSession().getAttribute("userid").equals(null)) {
                byte[] exportReportToPdf = reportsService.MenuInvoice(tableheadid, servletOutputStream, request);
                response.setContentType("text/html");
                response.setContentLength(exportReportToPdf.length);
                servletOutputStream.write(exportReportToPdf, 0, exportReportToPdf.length);
                servletOutputStream.flush();
                servletOutputStream.close();

            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Scheduled(initialDelay = 1500, fixedDelay = 1000 * 10)
    public void checker() throws IOException {
        String s = "{\"rentalrentoutedInvoice\":\"19\",\"startDate\":1545330600000,\"endDate\":1546280999999,\"discount\": 55,\"cashAmount\":0,\"checkAmount\":0,\"cardAmount\":0,\"creditAmount\":0,\"cardno\":\"\",\"checkNo\":\"\",\"checkBankDate\": 1545732376099,\"bankId\":1,\"rentOutedProductItems\":[{\"id\":9,\"Productid\":3,\"discount\":0,\"qty\":1,\"freeqty\":0}]}";
        ObjectMapper objectMapper = new ObjectMapper();
        RentalInvoiceingCreatingRequest request = objectMapper.readValue(s, RentalInvoiceingCreatingRequest.class);
        System.out.println("SDASDFAfdfafds" + request.getRentalRentoutedInvoice());
    }

    @RequestMapping("/test/{menuinvoiceid}/{fileFormat}")
    @ResponseBody
    public void TestReport(@PathVariable(value = "menuinvoiceid") String tableheadid,@PathVariable("fileFormat") String fileFormat, HttpServletResponse response, HttpServletRequest request) throws JRException, IOException, InvalidFontException {
		ServletOutputStream servletOutputStream = response.getOutputStream();
        try {
            if (!request.getSession().getAttribute("userid").equals(null)) {
                response.setContentType("text/html");
                byte[] exportReportToPdf  = reportsService.Test(tableheadid, request, response,fileFormat);
                response.setContentLength(exportReportToPdf.length);
                servletOutputStream.write(exportReportToPdf);
				servletOutputStream.flush();
				servletOutputStream.close();

            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
