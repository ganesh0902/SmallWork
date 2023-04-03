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

package com.test.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.test.model.smallwork;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing smallwork in entity cache.
 *
 * @author dell
 * @see smallwork
 * @generated
 */
public class smallworkCacheModel implements CacheModel<smallwork>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(59);

		sb.append("{id=");
		sb.append(id);
		sb.append(", quoteReference=");
		sb.append(quoteReference);
		sb.append(", projectName=");
		sb.append(projectName);
		sb.append(", customerAddress=");
		sb.append(customerAddress);
		sb.append(", workType=");
		sb.append(workType);
		sb.append(", leadSource=");
		sb.append(leadSource);
		sb.append(", productSpecific=");
		sb.append(productSpecific);
		sb.append(", description=");
		sb.append(description);
		sb.append(", customerName=");
		sb.append(customerName);
		sb.append(", postcode=");
		sb.append(postcode);
		sb.append(", sitename=");
		sb.append(sitename);
		sb.append(", lead=");
		sb.append(lead);
		sb.append(", location=");
		sb.append(location);
		sb.append(", enduser=");
		sb.append(enduser);
		sb.append(", contactName=");
		sb.append(contactName);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", email=");
		sb.append(email);
		sb.append(", projectDate=");
		sb.append(projectDate);
		sb.append(", anticipatedDate=");
		sb.append(anticipatedDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", endDate2=");
		sb.append(endDate2);
		sb.append(", bidInfor=");
		sb.append(bidInfor);
		sb.append(", quotationName=");
		sb.append(quotationName);
		sb.append(", projectCost=");
		sb.append(projectCost);
		sb.append(", dateShowOnQuote=");
		sb.append(dateShowOnQuote);
		sb.append(", projectSell=");
		sb.append(projectSell);
		sb.append(", quoteSubmitDate=");
		sb.append(quoteSubmitDate);
		sb.append(", winProbability=");
		sb.append(winProbability);
		sb.append(", stage=");
		sb.append(stage);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public smallwork toEntityModel() {
		smallworkImpl smallworkImpl = new smallworkImpl();

		smallworkImpl.setId(id);

		if (quoteReference == null) {
			smallworkImpl.setQuoteReference(StringPool.BLANK);
		}
		else {
			smallworkImpl.setQuoteReference(quoteReference);
		}

		if (projectName == null) {
			smallworkImpl.setProjectName(StringPool.BLANK);
		}
		else {
			smallworkImpl.setProjectName(projectName);
		}

		if (customerAddress == null) {
			smallworkImpl.setCustomerAddress(StringPool.BLANK);
		}
		else {
			smallworkImpl.setCustomerAddress(customerAddress);
		}

		if (workType == null) {
			smallworkImpl.setWorkType(StringPool.BLANK);
		}
		else {
			smallworkImpl.setWorkType(workType);
		}

		if (leadSource == null) {
			smallworkImpl.setLeadSource(StringPool.BLANK);
		}
		else {
			smallworkImpl.setLeadSource(leadSource);
		}

		if (productSpecific == null) {
			smallworkImpl.setProductSpecific(StringPool.BLANK);
		}
		else {
			smallworkImpl.setProductSpecific(productSpecific);
		}

		if (description == null) {
			smallworkImpl.setDescription(StringPool.BLANK);
		}
		else {
			smallworkImpl.setDescription(description);
		}

		if (customerName == null) {
			smallworkImpl.setCustomerName(StringPool.BLANK);
		}
		else {
			smallworkImpl.setCustomerName(customerName);
		}

		if (postcode == null) {
			smallworkImpl.setPostcode(StringPool.BLANK);
		}
		else {
			smallworkImpl.setPostcode(postcode);
		}

		if (sitename == null) {
			smallworkImpl.setSitename(StringPool.BLANK);
		}
		else {
			smallworkImpl.setSitename(sitename);
		}

		if (lead == null) {
			smallworkImpl.setLead(StringPool.BLANK);
		}
		else {
			smallworkImpl.setLead(lead);
		}

		if (location == null) {
			smallworkImpl.setLocation(StringPool.BLANK);
		}
		else {
			smallworkImpl.setLocation(location);
		}

		if (enduser == null) {
			smallworkImpl.setEnduser(StringPool.BLANK);
		}
		else {
			smallworkImpl.setEnduser(enduser);
		}

		if (contactName == null) {
			smallworkImpl.setContactName(StringPool.BLANK);
		}
		else {
			smallworkImpl.setContactName(contactName);
		}

		smallworkImpl.setPhone(phone);

		if (email == null) {
			smallworkImpl.setEmail(StringPool.BLANK);
		}
		else {
			smallworkImpl.setEmail(email);
		}

		if (projectDate == null) {
			smallworkImpl.setProjectDate(StringPool.BLANK);
		}
		else {
			smallworkImpl.setProjectDate(projectDate);
		}

		if (anticipatedDate == null) {
			smallworkImpl.setAnticipatedDate(StringPool.BLANK);
		}
		else {
			smallworkImpl.setAnticipatedDate(anticipatedDate);
		}

		if (endDate == null) {
			smallworkImpl.setEndDate(StringPool.BLANK);
		}
		else {
			smallworkImpl.setEndDate(endDate);
		}

		if (endDate2 == null) {
			smallworkImpl.setEndDate2(StringPool.BLANK);
		}
		else {
			smallworkImpl.setEndDate2(endDate2);
		}

		if (bidInfor == null) {
			smallworkImpl.setBidInfor(StringPool.BLANK);
		}
		else {
			smallworkImpl.setBidInfor(bidInfor);
		}

		if (quotationName == null) {
			smallworkImpl.setQuotationName(StringPool.BLANK);
		}
		else {
			smallworkImpl.setQuotationName(quotationName);
		}

		smallworkImpl.setProjectCost(projectCost);

		if (dateShowOnQuote == null) {
			smallworkImpl.setDateShowOnQuote(StringPool.BLANK);
		}
		else {
			smallworkImpl.setDateShowOnQuote(dateShowOnQuote);
		}

		smallworkImpl.setProjectSell(projectSell);

		if (quoteSubmitDate == null) {
			smallworkImpl.setQuoteSubmitDate(StringPool.BLANK);
		}
		else {
			smallworkImpl.setQuoteSubmitDate(quoteSubmitDate);
		}

		if (winProbability == null) {
			smallworkImpl.setWinProbability(StringPool.BLANK);
		}
		else {
			smallworkImpl.setWinProbability(winProbability);
		}

		if (stage == null) {
			smallworkImpl.setStage(StringPool.BLANK);
		}
		else {
			smallworkImpl.setStage(stage);
		}

		smallworkImpl.resetOriginalValues();

		return smallworkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		quoteReference = objectInput.readUTF();
		projectName = objectInput.readUTF();
		customerAddress = objectInput.readUTF();
		workType = objectInput.readUTF();
		leadSource = objectInput.readUTF();
		productSpecific = objectInput.readUTF();
		description = objectInput.readUTF();
		customerName = objectInput.readUTF();
		postcode = objectInput.readUTF();
		sitename = objectInput.readUTF();
		lead = objectInput.readUTF();
		location = objectInput.readUTF();
		enduser = objectInput.readUTF();
		contactName = objectInput.readUTF();
		phone = objectInput.readInt();
		email = objectInput.readUTF();
		projectDate = objectInput.readUTF();
		anticipatedDate = objectInput.readUTF();
		endDate = objectInput.readUTF();
		endDate2 = objectInput.readUTF();
		bidInfor = objectInput.readUTF();
		quotationName = objectInput.readUTF();
		projectCost = objectInput.readInt();
		dateShowOnQuote = objectInput.readUTF();
		projectSell = objectInput.readInt();
		quoteSubmitDate = objectInput.readUTF();
		winProbability = objectInput.readUTF();
		stage = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);

		if (quoteReference == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(quoteReference);
		}

		if (projectName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectName);
		}

		if (customerAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customerAddress);
		}

		if (workType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(workType);
		}

		if (leadSource == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(leadSource);
		}

		if (productSpecific == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productSpecific);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (customerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customerName);
		}

		if (postcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(postcode);
		}

		if (sitename == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sitename);
		}

		if (lead == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lead);
		}

		if (location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (enduser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enduser);
		}

		if (contactName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactName);
		}

		objectOutput.writeInt(phone);

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (projectDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectDate);
		}

		if (anticipatedDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(anticipatedDate);
		}

		if (endDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(endDate);
		}

		if (endDate2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(endDate2);
		}

		if (bidInfor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bidInfor);
		}

		if (quotationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(quotationName);
		}

		objectOutput.writeInt(projectCost);

		if (dateShowOnQuote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dateShowOnQuote);
		}

		objectOutput.writeInt(projectSell);

		if (quoteSubmitDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(quoteSubmitDate);
		}

		if (winProbability == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(winProbability);
		}

		if (stage == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stage);
		}
	}

	public int id;
	public String quoteReference;
	public String projectName;
	public String customerAddress;
	public String workType;
	public String leadSource;
	public String productSpecific;
	public String description;
	public String customerName;
	public String postcode;
	public String sitename;
	public String lead;
	public String location;
	public String enduser;
	public String contactName;
	public int phone;
	public String email;
	public String projectDate;
	public String anticipatedDate;
	public String endDate;
	public String endDate2;
	public String bidInfor;
	public String quotationName;
	public int projectCost;
	public String dateShowOnQuote;
	public int projectSell;
	public String quoteSubmitDate;
	public String winProbability;
	public String stage;
}