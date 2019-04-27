package com.icordium.server.controller.DataService;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.fonts.InvalidFontException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ReportsService {
    byte[] MenuRecepieDetails(int id, ServletOutputStream inputstream, HttpServletRequest request) throws JRException, IOException, InvalidFontException;

    byte[] RentalInvoice(int id, ServletOutputStream inputstream, HttpServletRequest request) throws JRException, IOException, InvalidFontException;

    byte[] RentalOrder(int id, ServletOutputStream inputstream, HttpServletRequest request) throws JRException, IOException, InvalidFontException;

    byte[] RentalDispatchInvoice(int id, ServletOutputStream inputstream, HttpServletRequest request) throws JRException, IOException, InvalidFontException;

    byte[] KOT(String id, ServletOutputStream inputstream, HttpServletRequest request) throws JRException, IOException, InvalidFontException;

    byte[] headOrder(String id, ServletOutputStream inputstream, HttpServletRequest request) throws JRException, IOException, InvalidFontException;

    byte[] MenuInvoice(String id, ServletOutputStream inputstream, HttpServletRequest request) throws JRException, IOException, InvalidFontException;

    byte[] Test(String id, HttpServletRequest request, HttpServletResponse httpServletResponse,String fileFormat) throws JRException, IOException, InvalidFontException;
}