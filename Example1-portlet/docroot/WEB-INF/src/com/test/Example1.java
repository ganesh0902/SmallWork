package com.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Action;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.dao.daoImplement;
import com.test.model.smallwork;
import com.test.model.statusofsubmittedquote;
import com.test.model.impl.statusofsubmittedquoteImpl;
import com.test.service.smallworkLocalService;
import com.test.service.smallworkLocalServiceUtil;
import com.test.service.statusofsubmittedquoteLocalServiceUtil;


/**
 * Portlet implementation class Example1
 */
public class Example1 extends MVCPortlet {
 
	@ProcessAction(name="saveAction")
	public void saveAction(ActionRequest request,ActionResponse response) throws Exception
	{
		String quoteReference=ParamUtil.getString(request,"quoteReference");
		String projectName=ParamUtil.getString(request,"projectName");		
		String customerAddress=ParamUtil.getString(request, "customerAddress");
		String workType=ParamUtil.getString(request,"workType");
		String leadSource=ParamUtil.getString(request, "leadSource");
		String productSpecific=ParamUtil.getString(request,"productSpecific");
		
		String description=ParamUtil.getString(request,"description");
		String customerName=ParamUtil.getString(request, "customerName");
		String postcode=ParamUtil.getString(request,"postcode");
		String sitename=ParamUtil.getString(request,"sitename");
		String lead=ParamUtil.getString(request,"lead");
		
		String location=ParamUtil.getString(request,"location");
		String enduser=ParamUtil.getString(request,"enduser");		
		String contactName = ParamUtil.getString(request,"contactName");
		int phone=ParamUtil.getInteger(request,"phone");	
		String email=ParamUtil.getString(request,"email");	
		String projectDate=ParamUtil.getString(request,"projectDate");
		
		String anticipatedDate= ParamUtil.getString(request,"anticipatedDate");
		String endDate=ParamUtil.getString(request,"endDate");
		String endDate2=ParamUtil.getString(request,"endDate2");		
		String bidInfor=ParamUtil.getString(request,"bidInfor");
		String quotationName=ParamUtil.getString(request,"quotationName");	
		
		int projectCost=ParamUtil.getInteger(request,"projectCost");		
		String dateShowOnQuote=ParamUtil.getString(request,"dateShowOnQuote");		
		int projectSell=ParamUtil.getInteger(request,"projectSell");
	
		//System.out.println("Project Name"+projectName+"customerAddress="+customerAddress+"workType="+workType+"leadSource="+leadSource+"productSpecific="+productSpecific);
		//System.out.println(description+"="+"customerName="+customerName+"postcode="+postcode+"sitename="+sitename+"lead="+lead);
		//System.out.println(location+"enduser="+enduser+"contact="+contactName+"phone="+phone+"email="+email+"projectDate ="+projectDate);
		//System.out.println(anticipatedDate+" endDate="+endDate+"endDate2="+endDate2+"bidInfor="+bidInfor+"quotationName="+quotationName);
		//System.out.println(projectCost+"dateShowOnQuote="+dateShowOnQuote+"projectSell"+projectSell);
		
		
		System.out.println("quoteReference is :"+quoteReference);
		System.out.println("project name is :"+projectName);
		System.out.println("projectDate: "+projectDate);
		System.out.println("anticipatedDate "+anticipatedDate);
		int id = (int) CounterLocalServiceUtil.increment();
		
		smallwork work=null;
		
		work= smallworkLocalServiceUtil.createsmallwork(id);
		
		work.setId(id);
		work.setQuoteReference(quoteReference);
		work.setProjectName(projectName);
		work.setCustomerAddress(customerAddress);
		work.setWorkType(workType);
		work.setLeadSource(leadSource);
		work.setProductSpecific(productSpecific);
		work.setDescription(description);
		work.setCustomerName(customerName);
		work.setPostcode(postcode);
		work.setSitename(sitename);
		work.setLead(lead);
		
		work.setLocation(location);
		work.setEnduser(enduser);
		work.setContactName(contactName);
		work.setPhone(phone);
		work.setEmail(email);
		work.setProjectDate(projectDate);
		work.setAnticipatedDate(anticipatedDate);
		work.setEndDate(endDate);
		work.setEndDate2(endDate2);
		
		work.setBidInfor(bidInfor);
		work.setQuotationName(quotationName);
		work.setProjectCost(projectCost);
		work.setDateShowOnQuote(dateShowOnQuote);
		work.setProjectSell(projectSell);
		
		work.setStage("submitquote");
		
		
		smallwork addsmallwork = smallworkLocalServiceUtil.addsmallwork(work);
		
		int record = daoImplement.getRecord();
		
		System.out.println("Current student is "+record);
		System.out.println("Record save successfully");
		
		response.setRenderParameter("mvcPath","/html/example1/DashBoard.jsp");
	
		request.setAttribute("key","submitQuoteUpdate");
	}
	@ProcessAction(name="updateMethod")
	public void updateMethod(ActionRequest request,ActionResponse response) throws PortalException, SystemException
	{
		System.out.println("process action called");
		
		int currentId=ParamUtil.getInteger(request,"currentId");
		String quoteReference=ParamUtil.getString(request,"quoteReference");
		String projectName=ParamUtil.getString(request,"projectName");		
		String customerAddress=ParamUtil.getString(request, "customerAddress");
		String workType=ParamUtil.getString(request,"workType");
		String leadSource=ParamUtil.getString(request, "leadSource");
		String productSpecific=ParamUtil.getString(request,"productSpecific");
		
		String description=ParamUtil.getString(request,"description");
		String customerName=ParamUtil.getString(request, "customerName");
		String postcode=ParamUtil.getString(request,"postcode");
		String sitename=ParamUtil.getString(request,"sitename");
		String lead=ParamUtil.getString(request,"lead");
		
		String location=ParamUtil.getString(request,"location");
		String enduser=ParamUtil.getString(request,"enduser");		
		String contactName = ParamUtil.getString(request,"contactName");
		int phone=ParamUtil.getInteger(request,"phone");	
		String email=ParamUtil.getString(request,"email");	
		String projectDate=ParamUtil.getString(request,"projectDate");
		
		String anticipatedDate= ParamUtil.getString(request,"anticipatedDate");
		String endDate=ParamUtil.getString(request,"endDate");
		String endDate2=ParamUtil.getString(request,"endDate2");		
		String bidInfor=ParamUtil.getString(request,"bidInfor");
		String quotationName=ParamUtil.getString(request,"quotationName");	
		
		int projectCost=ParamUtil.getInteger(request,"projectCost");		
		String dateShowOnQuote=ParamUtil.getString(request,"dateShowOnQuote");		
		int projectSell=ParamUtil.getInteger(request,"projectSell");
	
		
		String quoteSubmitDate = ParamUtil.getString(request,"quoteSubmitDate");
		String winProbability=ParamUtil.getString(request,"winProbability");
		
		System.out.println("quoteSubmitDate="+quoteSubmitDate);
		System.out.println("winProbability="+winProbability);
		
		smallwork work = smallworkLocalServiceUtil.getsmallwork(currentId);
		
		work.setId(currentId);
		work.setQuoteReference(quoteReference);
		work.setProjectName(projectName);
		work.setCustomerAddress(customerAddress);
		//work.setWorkType(workType);
		//work.setLeadSource(leadSource);
		//work.setProductSpecific(productSpecific);
		work.setDescription(description);
		work.setCustomerName(customerName);
		work.setPostcode(postcode);
		work.setSitename(sitename);
		work.setLead(lead);
		
		work.setLocation(location);
		work.setEnduser(enduser);
		work.setContactName(contactName);
		work.setPhone(phone);
		work.setEmail(email);
		//work.setProjectDate(projectDate);
		//work.setAnticipatedDate(anticipatedDate);
		//work.setEndDate(endDate);
		//work.setEndDate2(endDate2);
		
		//work.setBidInfor(bidInfor);
		//work.setQuotationName(quotationName);
		work.setProjectCost(projectCost);
		//work.setDateShowOnQuote(dateShowOnQuote);
		work.setProjectSell(projectSell);
		work.setQuoteSubmitDate(quoteSubmitDate);
		work.setWinProbability(winProbability);
		work.setStage("submitQuote");
		smallworkLocalServiceUtil.updatesmallwork(work);
		response.setRenderParameter("mvcPath","/html/example1/DashBoard.jsp");
		System.out.println("Record update successfully");
	}
	@ProcessAction(name="stausOfSubmitedQuote")
	public void stausOfSubmitedQuote(ActionRequest request,ActionResponse response) throws SystemException, PortalException{
		
 System.out.println("method Called");
		
		String sosq = ParamUtil.getString(request,"Status_Of_Submitted_Quote");
		System.out.println("Status_Of_Submitted_Quote"+sosq);
		
		String winp = ParamUtil.getString(request, "winp");
		System.out.println("winp= " +winp);
		
		String aoddate = ParamUtil.getString(request, "aoddate");
		System.out.println("aoddate= " +aoddate);
		
		String ppsddate = ParamUtil.getString(request, "ppsddate");
		System.out.println("ppsddate= " +ppsddate);
		
		String ppeddate = ParamUtil.getString(request, "ppeddate");
		System.out.println("ppsddate= " +ppeddate);
		
		String cct = ParamUtil.getString(request,"Customer_Commitment_Type");
		System.out.println("Customer_Commitment_Type "+cct);
		
		String upo = ParamUtil.getString(request, "uploadpo");
		System.out.println("uploadPo= " +upo);
		
		long voc = ParamUtil.getLong(request, "voc");
		System.out.println("voc= "+voc);
		
		String rmethod = ParamUtil.getString(request, "rmethod");
		System.out.println("voc= "+rmethod);
		
		String rdate = ParamUtil.getString(request, "rdate");
		System.out.println("voc= "+rdate);
		
		String pcdc = ParamUtil.getString(request, "PCDC");
		System.out.println("pcdc= "+pcdc);
		
		String owb = ParamUtil.getString(request, "owb");
		System.out.println("OWB= "+owb);
		
		String RFormat = ParamUtil.getString(request, "RFormat");
		System.out.println("RFormat= "+RFormat);
		
		
		String comments = ParamUtil.getString(request, "comments");
		System.out.println("Comment"+comments);	
		
		int currentId=ParamUtil.getInteger(request,"currentId");
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault());
		Date date = new Date();
		df.setTimeZone(TimeZone.getTimeZone("IST"));
		String strdate = df.format(date);
		System.out.println("Date of Creation is"+strdate);
		
		long sid = CounterLocalServiceUtil.increment();
		
		statusofsubmittedquote soq = new statusofsubmittedquoteImpl();
		soq = statusofsubmittedquoteLocalServiceUtil.createstatusofsubmittedquote(sid);
		
		soq.setSosq(sosq);
		soq.setWinprob(winp);
		soq.setAorderdate(aoddate);
		soq.setPpstartdate(ppsddate);
		soq.setPpenddate(ppeddate);
		soq.setCreateDate(strdate);
		soq.setCustomercomittype(cct);
		soq.setUpload(upo);
		soq.setValueofcommit(voc);
		soq.setRmethod(rmethod);
		soq.setRdate(rdate);
		soq.setPcdc(pcdc);
		soq.setOnwhatbasis(owb);
		soq.setRecordproposedcourse(RFormat);
		soq.setComments(comments);
		soq.setCurrrentId(currentId);
		soq = statusofsubmittedquoteLocalServiceUtil.addstatusofsubmittedquote(soq);
		
		smallwork work = smallworkLocalServiceUtil.getsmallwork(currentId);
		work.setStage("prepareReviewQuote");
		smallworkLocalServiceUtil.updatesmallwork(work);
		
		if(soq!=null){
			System.out.println("data inserted successfully");
			response.setRenderParameter("mvcPath","/html/example1/DashBoard.jsp");
		}
		else{
			System.out.println("Unable to insert Data");
		}
		System.out.println("status of submit quote :="+sosq);
		if(sosq.equals("Amend Bid"))
		{
			response.setRenderParameter("mvcPath","/html/example1/DashBoard.jsp");
		}	
		
	}
	@ProcessAction(name="prepareQuote")	
	public void prepareQuote(ActionRequest request,ActionResponse response) throws PortalException, SystemException
	{
		int currentId=101;//=ParamUtil.getInteger(request,"currentId");
		smallwork work = smallworkLocalServiceUtil.getsmallwork(currentId);
		work.setId(currentId);
		work.setStage("preOrder");
		smallworkLocalServiceUtil.updatesmallwork(work);
		
		response.setRenderParameter("mvcPath","/html/example1/DashBoard.jsp");
		
	
	}
	@ProcessAction(name="prepOrder")
	public void prepOrder(ActionRequest request,ActionResponse response) throws PortalException, SystemException{
		
		int currentId=101;//=ParamUtil.getInteger(request,"currentId");
		smallwork work = smallworkLocalServiceUtil.getsmallwork(currentId);
		work.setId(currentId);
		work.setStage("status");
		smallworkLocalServiceUtil.updatesmallwork(work);
		response.setRenderParameter("mvcPath","/html/example1/DashBoard.jsp");
	}
	public void ambedUpdates(ActionRequest request ,ActionResponse response) throws SystemException, PortalException
	{

		System.out.println("process action called");
		
		int currentId=ParamUtil.getInteger(request,"currentId");
		String quoteReference=ParamUtil.getString(request,"quoteReference");
		String projectName=ParamUtil.getString(request,"projectName");		
		String customerAddress=ParamUtil.getString(request, "customerAddress");
		String workType=ParamUtil.getString(request,"workType");
		String leadSource=ParamUtil.getString(request, "leadSource");
		String productSpecific=ParamUtil.getString(request,"productSpecific");
		
		String description=ParamUtil.getString(request,"description");
		String customerName=ParamUtil.getString(request, "customerName");
		String postcode=ParamUtil.getString(request,"postcode");
		String sitename=ParamUtil.getString(request,"sitename");
		String lead=ParamUtil.getString(request,"lead");
		
		String location=ParamUtil.getString(request,"location");
		String enduser=ParamUtil.getString(request,"enduser");		
		String contactName = ParamUtil.getString(request,"contactName");
		int phone=ParamUtil.getInteger(request,"phone");	
		String email=ParamUtil.getString(request,"email");	
		String projectDate=ParamUtil.getString(request,"projectDate");
		
		String anticipatedDate= ParamUtil.getString(request,"anticipatedDate");
		String endDate=ParamUtil.getString(request,"endDate");
		String endDate2=ParamUtil.getString(request,"endDate2");		
		String bidInfor=ParamUtil.getString(request,"bidInfor");
		String quotationName=ParamUtil.getString(request,"quotationName");	
		
		int projectCost=ParamUtil.getInteger(request,"projectCost");		
		String dateShowOnQuote=ParamUtil.getString(request,"dateShowOnQuote");		
		int projectSell=ParamUtil.getInteger(request,"projectSell");
	
		
		String quoteSubmitDate = ParamUtil.getString(request,"quoteSubmitDate");
		String winProbability=ParamUtil.getString(request,"winProbability");
		
		System.out.println("quoteSubmitDate="+quoteSubmitDate);
		System.out.println("winProbability="+winProbability);
		
		smallwork work = smallworkLocalServiceUtil.getsmallwork(currentId);
		
		work.setId(currentId);
		work.setQuoteReference(quoteReference);
		work.setProjectName(projectName);
		work.setCustomerAddress(customerAddress);
		//work.setWorkType(workType);
		//work.setLeadSource(leadSource);
		//work.setProductSpecific(productSpecific);
		work.setDescription(description);
		work.setCustomerName(customerName);
		work.setPostcode(postcode);
		work.setSitename(sitename);
		work.setLead(lead);
		
		work.setLocation(location);
		work.setEnduser(enduser);
		work.setContactName(contactName);
		work.setPhone(phone);
		work.setEmail(email);
		//work.setProjectDate(projectDate);
		//work.setAnticipatedDate(anticipatedDate);
		//work.setEndDate(endDate);
		//work.setEndDate2(endDate2);
		
		//work.setBidInfor(bidInfor);
		//work.setQuotationName(quotationName);
		work.setProjectCost(projectCost);
		//work.setDateShowOnQuote(dateShowOnQuote);
		work.setProjectSell(projectSell);
		work.setQuoteSubmitDate(quoteSubmitDate);
		work.setWinProbability(winProbability);
		work.setStage("combine");
		smallworkLocalServiceUtil.updatesmallwork(work);
		response.setRenderParameter("mvcPath","/html/example1/DashBoard.jsp");
		System.out.println("Record update successfully");
		
	}
}