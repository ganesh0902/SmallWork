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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.service.ClpSerializer;
import com.test.service.smallworkLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dell
 */
public class smallworkClp extends BaseModelImpl<smallwork> implements smallwork {
	public smallworkClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return smallwork.class;
	}

	@Override
	public String getModelClassName() {
		return smallwork.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("quoteReference", getQuoteReference());
		attributes.put("projectName", getProjectName());
		attributes.put("customerAddress", getCustomerAddress());
		attributes.put("workType", getWorkType());
		attributes.put("leadSource", getLeadSource());
		attributes.put("productSpecific", getProductSpecific());
		attributes.put("description", getDescription());
		attributes.put("customerName", getCustomerName());
		attributes.put("postcode", getPostcode());
		attributes.put("sitename", getSitename());
		attributes.put("lead", getLead());
		attributes.put("location", getLocation());
		attributes.put("enduser", getEnduser());
		attributes.put("contactName", getContactName());
		attributes.put("phone", getPhone());
		attributes.put("email", getEmail());
		attributes.put("projectDate", getProjectDate());
		attributes.put("anticipatedDate", getAnticipatedDate());
		attributes.put("endDate", getEndDate());
		attributes.put("endDate2", getEndDate2());
		attributes.put("bidInfor", getBidInfor());
		attributes.put("quotationName", getQuotationName());
		attributes.put("projectCost", getProjectCost());
		attributes.put("dateShowOnQuote", getDateShowOnQuote());
		attributes.put("projectSell", getProjectSell());
		attributes.put("quoteSubmitDate", getQuoteSubmitDate());
		attributes.put("winProbability", getWinProbability());
		attributes.put("stage", getStage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String quoteReference = (String)attributes.get("quoteReference");

		if (quoteReference != null) {
			setQuoteReference(quoteReference);
		}

		String projectName = (String)attributes.get("projectName");

		if (projectName != null) {
			setProjectName(projectName);
		}

		String customerAddress = (String)attributes.get("customerAddress");

		if (customerAddress != null) {
			setCustomerAddress(customerAddress);
		}

		String workType = (String)attributes.get("workType");

		if (workType != null) {
			setWorkType(workType);
		}

		String leadSource = (String)attributes.get("leadSource");

		if (leadSource != null) {
			setLeadSource(leadSource);
		}

		String productSpecific = (String)attributes.get("productSpecific");

		if (productSpecific != null) {
			setProductSpecific(productSpecific);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String customerName = (String)attributes.get("customerName");

		if (customerName != null) {
			setCustomerName(customerName);
		}

		String postcode = (String)attributes.get("postcode");

		if (postcode != null) {
			setPostcode(postcode);
		}

		String sitename = (String)attributes.get("sitename");

		if (sitename != null) {
			setSitename(sitename);
		}

		String lead = (String)attributes.get("lead");

		if (lead != null) {
			setLead(lead);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String enduser = (String)attributes.get("enduser");

		if (enduser != null) {
			setEnduser(enduser);
		}

		String contactName = (String)attributes.get("contactName");

		if (contactName != null) {
			setContactName(contactName);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String projectDate = (String)attributes.get("projectDate");

		if (projectDate != null) {
			setProjectDate(projectDate);
		}

		String anticipatedDate = (String)attributes.get("anticipatedDate");

		if (anticipatedDate != null) {
			setAnticipatedDate(anticipatedDate);
		}

		String endDate = (String)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		String endDate2 = (String)attributes.get("endDate2");

		if (endDate2 != null) {
			setEndDate2(endDate2);
		}

		String bidInfor = (String)attributes.get("bidInfor");

		if (bidInfor != null) {
			setBidInfor(bidInfor);
		}

		String quotationName = (String)attributes.get("quotationName");

		if (quotationName != null) {
			setQuotationName(quotationName);
		}

		Integer projectCost = (Integer)attributes.get("projectCost");

		if (projectCost != null) {
			setProjectCost(projectCost);
		}

		String dateShowOnQuote = (String)attributes.get("dateShowOnQuote");

		if (dateShowOnQuote != null) {
			setDateShowOnQuote(dateShowOnQuote);
		}

		Integer projectSell = (Integer)attributes.get("projectSell");

		if (projectSell != null) {
			setProjectSell(projectSell);
		}

		String quoteSubmitDate = (String)attributes.get("quoteSubmitDate");

		if (quoteSubmitDate != null) {
			setQuoteSubmitDate(quoteSubmitDate);
		}

		String winProbability = (String)attributes.get("winProbability");

		if (winProbability != null) {
			setWinProbability(winProbability);
		}

		String stage = (String)attributes.get("stage");

		if (stage != null) {
			setStage(stage);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_smallworkRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuoteReference() {
		return _quoteReference;
	}

	@Override
	public void setQuoteReference(String quoteReference) {
		_quoteReference = quoteReference;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setQuoteReference",
						String.class);

				method.invoke(_smallworkRemoteModel, quoteReference);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProjectName() {
		return _projectName;
	}

	@Override
	public void setProjectName(String projectName) {
		_projectName = projectName;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setProjectName", String.class);

				method.invoke(_smallworkRemoteModel, projectName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustomerAddress() {
		return _customerAddress;
	}

	@Override
	public void setCustomerAddress(String customerAddress) {
		_customerAddress = customerAddress;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerAddress",
						String.class);

				method.invoke(_smallworkRemoteModel, customerAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWorkType() {
		return _workType;
	}

	@Override
	public void setWorkType(String workType) {
		_workType = workType;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setWorkType", String.class);

				method.invoke(_smallworkRemoteModel, workType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLeadSource() {
		return _leadSource;
	}

	@Override
	public void setLeadSource(String leadSource) {
		_leadSource = leadSource;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setLeadSource", String.class);

				method.invoke(_smallworkRemoteModel, leadSource);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductSpecific() {
		return _productSpecific;
	}

	@Override
	public void setProductSpecific(String productSpecific) {
		_productSpecific = productSpecific;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setProductSpecific",
						String.class);

				method.invoke(_smallworkRemoteModel, productSpecific);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_smallworkRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustomerName() {
		return _customerName;
	}

	@Override
	public void setCustomerName(String customerName) {
		_customerName = customerName;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerName", String.class);

				method.invoke(_smallworkRemoteModel, customerName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPostcode() {
		return _postcode;
	}

	@Override
	public void setPostcode(String postcode) {
		_postcode = postcode;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setPostcode", String.class);

				method.invoke(_smallworkRemoteModel, postcode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSitename() {
		return _sitename;
	}

	@Override
	public void setSitename(String sitename) {
		_sitename = sitename;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setSitename", String.class);

				method.invoke(_smallworkRemoteModel, sitename);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLead() {
		return _lead;
	}

	@Override
	public void setLead(String lead) {
		_lead = lead;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setLead", String.class);

				method.invoke(_smallworkRemoteModel, lead);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLocation() {
		return _location;
	}

	@Override
	public void setLocation(String location) {
		_location = location;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation", String.class);

				method.invoke(_smallworkRemoteModel, location);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnduser() {
		return _enduser;
	}

	@Override
	public void setEnduser(String enduser) {
		_enduser = enduser;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setEnduser", String.class);

				method.invoke(_smallworkRemoteModel, enduser);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactName() {
		return _contactName;
	}

	@Override
	public void setContactName(String contactName) {
		_contactName = contactName;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setContactName", String.class);

				method.invoke(_smallworkRemoteModel, contactName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhone() {
		return _phone;
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setPhone", String.class);

				method.invoke(_smallworkRemoteModel, phone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_smallworkRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProjectDate() {
		return _projectDate;
	}

	@Override
	public void setProjectDate(String projectDate) {
		_projectDate = projectDate;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setProjectDate", String.class);

				method.invoke(_smallworkRemoteModel, projectDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnticipatedDate() {
		return _anticipatedDate;
	}

	@Override
	public void setAnticipatedDate(String anticipatedDate) {
		_anticipatedDate = anticipatedDate;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setAnticipatedDate",
						String.class);

				method.invoke(_smallworkRemoteModel, anticipatedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEndDate() {
		return _endDate;
	}

	@Override
	public void setEndDate(String endDate) {
		_endDate = endDate;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setEndDate", String.class);

				method.invoke(_smallworkRemoteModel, endDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEndDate2() {
		return _endDate2;
	}

	@Override
	public void setEndDate2(String endDate2) {
		_endDate2 = endDate2;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setEndDate2", String.class);

				method.invoke(_smallworkRemoteModel, endDate2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBidInfor() {
		return _bidInfor;
	}

	@Override
	public void setBidInfor(String bidInfor) {
		_bidInfor = bidInfor;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setBidInfor", String.class);

				method.invoke(_smallworkRemoteModel, bidInfor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuotationName() {
		return _quotationName;
	}

	@Override
	public void setQuotationName(String quotationName) {
		_quotationName = quotationName;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setQuotationName", String.class);

				method.invoke(_smallworkRemoteModel, quotationName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getProjectCost() {
		return _projectCost;
	}

	@Override
	public void setProjectCost(int projectCost) {
		_projectCost = projectCost;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setProjectCost", int.class);

				method.invoke(_smallworkRemoteModel, projectCost);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDateShowOnQuote() {
		return _dateShowOnQuote;
	}

	@Override
	public void setDateShowOnQuote(String dateShowOnQuote) {
		_dateShowOnQuote = dateShowOnQuote;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setDateShowOnQuote",
						String.class);

				method.invoke(_smallworkRemoteModel, dateShowOnQuote);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getProjectSell() {
		return _projectSell;
	}

	@Override
	public void setProjectSell(int projectSell) {
		_projectSell = projectSell;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setProjectSell", int.class);

				method.invoke(_smallworkRemoteModel, projectSell);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuoteSubmitDate() {
		return _quoteSubmitDate;
	}

	@Override
	public void setQuoteSubmitDate(String quoteSubmitDate) {
		_quoteSubmitDate = quoteSubmitDate;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setQuoteSubmitDate",
						String.class);

				method.invoke(_smallworkRemoteModel, quoteSubmitDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWinProbability() {
		return _winProbability;
	}

	@Override
	public void setWinProbability(String winProbability) {
		_winProbability = winProbability;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setWinProbability",
						String.class);

				method.invoke(_smallworkRemoteModel, winProbability);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStage() {
		return _stage;
	}

	@Override
	public void setStage(String stage) {
		_stage = stage;

		if (_smallworkRemoteModel != null) {
			try {
				Class<?> clazz = _smallworkRemoteModel.getClass();

				Method method = clazz.getMethod("setStage", String.class);

				method.invoke(_smallworkRemoteModel, stage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getsmallworkRemoteModel() {
		return _smallworkRemoteModel;
	}

	public void setsmallworkRemoteModel(BaseModel<?> smallworkRemoteModel) {
		_smallworkRemoteModel = smallworkRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _smallworkRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_smallworkRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			smallworkLocalServiceUtil.addsmallwork(this);
		}
		else {
			smallworkLocalServiceUtil.updatesmallwork(this);
		}
	}

	@Override
	public smallwork toEscapedModel() {
		return (smallwork)ProxyUtil.newProxyInstance(smallwork.class.getClassLoader(),
			new Class[] { smallwork.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		smallworkClp clone = new smallworkClp();

		clone.setId(getId());
		clone.setQuoteReference(getQuoteReference());
		clone.setProjectName(getProjectName());
		clone.setCustomerAddress(getCustomerAddress());
		clone.setWorkType(getWorkType());
		clone.setLeadSource(getLeadSource());
		clone.setProductSpecific(getProductSpecific());
		clone.setDescription(getDescription());
		clone.setCustomerName(getCustomerName());
		clone.setPostcode(getPostcode());
		clone.setSitename(getSitename());
		clone.setLead(getLead());
		clone.setLocation(getLocation());
		clone.setEnduser(getEnduser());
		clone.setContactName(getContactName());
		clone.setPhone(getPhone());
		clone.setEmail(getEmail());
		clone.setProjectDate(getProjectDate());
		clone.setAnticipatedDate(getAnticipatedDate());
		clone.setEndDate(getEndDate());
		clone.setEndDate2(getEndDate2());
		clone.setBidInfor(getBidInfor());
		clone.setQuotationName(getQuotationName());
		clone.setProjectCost(getProjectCost());
		clone.setDateShowOnQuote(getDateShowOnQuote());
		clone.setProjectSell(getProjectSell());
		clone.setQuoteSubmitDate(getQuoteSubmitDate());
		clone.setWinProbability(getWinProbability());
		clone.setStage(getStage());

		return clone;
	}

	@Override
	public int compareTo(smallwork smallwork) {
		int primaryKey = smallwork.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof smallworkClp)) {
			return false;
		}

		smallworkClp smallwork = (smallworkClp)obj;

		int primaryKey = smallwork.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(59);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", quoteReference=");
		sb.append(getQuoteReference());
		sb.append(", projectName=");
		sb.append(getProjectName());
		sb.append(", customerAddress=");
		sb.append(getCustomerAddress());
		sb.append(", workType=");
		sb.append(getWorkType());
		sb.append(", leadSource=");
		sb.append(getLeadSource());
		sb.append(", productSpecific=");
		sb.append(getProductSpecific());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", customerName=");
		sb.append(getCustomerName());
		sb.append(", postcode=");
		sb.append(getPostcode());
		sb.append(", sitename=");
		sb.append(getSitename());
		sb.append(", lead=");
		sb.append(getLead());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", enduser=");
		sb.append(getEnduser());
		sb.append(", contactName=");
		sb.append(getContactName());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", projectDate=");
		sb.append(getProjectDate());
		sb.append(", anticipatedDate=");
		sb.append(getAnticipatedDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append(", endDate2=");
		sb.append(getEndDate2());
		sb.append(", bidInfor=");
		sb.append(getBidInfor());
		sb.append(", quotationName=");
		sb.append(getQuotationName());
		sb.append(", projectCost=");
		sb.append(getProjectCost());
		sb.append(", dateShowOnQuote=");
		sb.append(getDateShowOnQuote());
		sb.append(", projectSell=");
		sb.append(getProjectSell());
		sb.append(", quoteSubmitDate=");
		sb.append(getQuoteSubmitDate());
		sb.append(", winProbability=");
		sb.append(getWinProbability());
		sb.append(", stage=");
		sb.append(getStage());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(91);

		sb.append("<model><model-name>");
		sb.append("com.test.model.smallwork");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quoteReference</column-name><column-value><![CDATA[");
		sb.append(getQuoteReference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectName</column-name><column-value><![CDATA[");
		sb.append(getProjectName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerAddress</column-name><column-value><![CDATA[");
		sb.append(getCustomerAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>workType</column-name><column-value><![CDATA[");
		sb.append(getWorkType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leadSource</column-name><column-value><![CDATA[");
		sb.append(getLeadSource());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productSpecific</column-name><column-value><![CDATA[");
		sb.append(getProductSpecific());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerName</column-name><column-value><![CDATA[");
		sb.append(getCustomerName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postcode</column-name><column-value><![CDATA[");
		sb.append(getPostcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sitename</column-name><column-value><![CDATA[");
		sb.append(getSitename());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lead</column-name><column-value><![CDATA[");
		sb.append(getLead());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enduser</column-name><column-value><![CDATA[");
		sb.append(getEnduser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactName</column-name><column-value><![CDATA[");
		sb.append(getContactName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectDate</column-name><column-value><![CDATA[");
		sb.append(getProjectDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anticipatedDate</column-name><column-value><![CDATA[");
		sb.append(getAnticipatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate2</column-name><column-value><![CDATA[");
		sb.append(getEndDate2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bidInfor</column-name><column-value><![CDATA[");
		sb.append(getBidInfor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quotationName</column-name><column-value><![CDATA[");
		sb.append(getQuotationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectCost</column-name><column-value><![CDATA[");
		sb.append(getProjectCost());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateShowOnQuote</column-name><column-value><![CDATA[");
		sb.append(getDateShowOnQuote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectSell</column-name><column-value><![CDATA[");
		sb.append(getProjectSell());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quoteSubmitDate</column-name><column-value><![CDATA[");
		sb.append(getQuoteSubmitDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>winProbability</column-name><column-value><![CDATA[");
		sb.append(getWinProbability());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stage</column-name><column-value><![CDATA[");
		sb.append(getStage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _smallworkRemoteModel;
	private Class<?> _clpSerializerClass = com.test.service.ClpSerializer.class;
}