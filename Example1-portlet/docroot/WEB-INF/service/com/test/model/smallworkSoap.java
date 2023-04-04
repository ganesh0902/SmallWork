/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.test.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.test.service.http.smallworkServiceSoap}.
 *
 * @author dell
 * @see com.test.service.http.smallworkServiceSoap
 * @generated
 */
public class smallworkSoap implements Serializable {
	public static smallworkSoap toSoapModel(smallwork model) {
		smallworkSoap soapModel = new smallworkSoap();

		soapModel.setId(model.getId());
		soapModel.setQuoteReference(model.getQuoteReference());
		soapModel.setProjectName(model.getProjectName());
		soapModel.setCustomerAddress(model.getCustomerAddress());
		soapModel.setWorkType(model.getWorkType());
		soapModel.setLeadSource(model.getLeadSource());
		soapModel.setProductSpecific(model.getProductSpecific());
		soapModel.setDescription(model.getDescription());
		soapModel.setCustomerName(model.getCustomerName());
		soapModel.setPostcode(model.getPostcode());
		soapModel.setSitename(model.getSitename());
		soapModel.setLead(model.getLead());
		soapModel.setLocation(model.getLocation());
		soapModel.setEnduser(model.getEnduser());
		soapModel.setContactName(model.getContactName());
		soapModel.setPhone(model.getPhone());
		soapModel.setEmail(model.getEmail());
		soapModel.setProjectDate(model.getProjectDate());
		soapModel.setAnticipatedDate(model.getAnticipatedDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setEndDate2(model.getEndDate2());
		soapModel.setBidInfor(model.getBidInfor());
		soapModel.setQuotationName(model.getQuotationName());
		soapModel.setProjectCost(model.getProjectCost());
		soapModel.setDateShowOnQuote(model.getDateShowOnQuote());
		soapModel.setProjectSell(model.getProjectSell());
		soapModel.setQuoteSubmitDate(model.getQuoteSubmitDate());
		soapModel.setWinProbability(model.getWinProbability());
		soapModel.setStage(model.getStage());

		return soapModel;
	}

	public static smallworkSoap[] toSoapModels(smallwork[] models) {
		smallworkSoap[] soapModels = new smallworkSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static smallworkSoap[][] toSoapModels(smallwork[][] models) {
		smallworkSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new smallworkSoap[models.length][models[0].length];
		}
		else {
			soapModels = new smallworkSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static smallworkSoap[] toSoapModels(List<smallwork> models) {
		List<smallworkSoap> soapModels = new ArrayList<smallworkSoap>(models.size());

		for (smallwork model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new smallworkSoap[soapModels.size()]);
	}

	public smallworkSoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getQuoteReference() {
		return _quoteReference;
	}

	public void setQuoteReference(String quoteReference) {
		_quoteReference = quoteReference;
	}

	public String getProjectName() {
		return _projectName;
	}

	public void setProjectName(String projectName) {
		_projectName = projectName;
	}

	public String getCustomerAddress() {
		return _customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		_customerAddress = customerAddress;
	}

	public String getWorkType() {
		return _workType;
	}

	public void setWorkType(String workType) {
		_workType = workType;
	}

	public String getLeadSource() {
		return _leadSource;
	}

	public void setLeadSource(String leadSource) {
		_leadSource = leadSource;
	}

	public String getProductSpecific() {
		return _productSpecific;
	}

	public void setProductSpecific(String productSpecific) {
		_productSpecific = productSpecific;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getCustomerName() {
		return _customerName;
	}

	public void setCustomerName(String customerName) {
		_customerName = customerName;
	}

	public String getPostcode() {
		return _postcode;
	}

	public void setPostcode(String postcode) {
		_postcode = postcode;
	}

	public String getSitename() {
		return _sitename;
	}

	public void setSitename(String sitename) {
		_sitename = sitename;
	}

	public String getLead() {
		return _lead;
	}

	public void setLead(String lead) {
		_lead = lead;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public String getEnduser() {
		return _enduser;
	}

	public void setEnduser(String enduser) {
		_enduser = enduser;
	}

	public String getContactName() {
		return _contactName;
	}

	public void setContactName(String contactName) {
		_contactName = contactName;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getProjectDate() {
		return _projectDate;
	}

	public void setProjectDate(String projectDate) {
		_projectDate = projectDate;
	}

	public String getAnticipatedDate() {
		return _anticipatedDate;
	}

	public void setAnticipatedDate(String anticipatedDate) {
		_anticipatedDate = anticipatedDate;
	}

	public String getEndDate() {
		return _endDate;
	}

	public void setEndDate(String endDate) {
		_endDate = endDate;
	}

	public String getEndDate2() {
		return _endDate2;
	}

	public void setEndDate2(String endDate2) {
		_endDate2 = endDate2;
	}

	public String getBidInfor() {
		return _bidInfor;
	}

	public void setBidInfor(String bidInfor) {
		_bidInfor = bidInfor;
	}

	public String getQuotationName() {
		return _quotationName;
	}

	public void setQuotationName(String quotationName) {
		_quotationName = quotationName;
	}

	public int getProjectCost() {
		return _projectCost;
	}

	public void setProjectCost(int projectCost) {
		_projectCost = projectCost;
	}

	public String getDateShowOnQuote() {
		return _dateShowOnQuote;
	}

	public void setDateShowOnQuote(String dateShowOnQuote) {
		_dateShowOnQuote = dateShowOnQuote;
	}

	public int getProjectSell() {
		return _projectSell;
	}

	public void setProjectSell(int projectSell) {
		_projectSell = projectSell;
	}

	public String getQuoteSubmitDate() {
		return _quoteSubmitDate;
	}

	public void setQuoteSubmitDate(String quoteSubmitDate) {
		_quoteSubmitDate = quoteSubmitDate;
	}

	public String getWinProbability() {
		return _winProbability;
	}

	public void setWinProbability(String winProbability) {
		_winProbability = winProbability;
	}

	public String getStage() {
		return _stage;
	}

	public void setStage(String stage) {
		_stage = stage;
	}

	private int _id;
	private String _quoteReference;
	private String _projectName;
	private String _customerAddress;
	private String _workType;
	private String _leadSource;
	private String _productSpecific;
	private String _description;
	private String _customerName;
	private String _postcode;
	private String _sitename;
	private String _lead;
	private String _location;
	private String _enduser;
	private String _contactName;
	private String _phone;
	private String _email;
	private String _projectDate;
	private String _anticipatedDate;
	private String _endDate;
	private String _endDate2;
	private String _bidInfor;
	private String _quotationName;
	private int _projectCost;
	private String _dateShowOnQuote;
	private int _projectSell;
	private String _quoteSubmitDate;
	private String _winProbability;
	private String _stage;
}