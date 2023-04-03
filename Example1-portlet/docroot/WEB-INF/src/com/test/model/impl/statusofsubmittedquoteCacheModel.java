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

import com.test.model.statusofsubmittedquote;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing statusofsubmittedquote in entity cache.
 *
 * @author dell
 * @see statusofsubmittedquote
 * @generated
 */
public class statusofsubmittedquoteCacheModel implements CacheModel<statusofsubmittedquote>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{sosqId=");
		sb.append(sosqId);
		sb.append(", sosq=");
		sb.append(sosq);
		sb.append(", winprob=");
		sb.append(winprob);
		sb.append(", aorderdate=");
		sb.append(aorderdate);
		sb.append(", ppstartdate=");
		sb.append(ppstartdate);
		sb.append(", ppenddate=");
		sb.append(ppenddate);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", customercomittype=");
		sb.append(customercomittype);
		sb.append(", upload=");
		sb.append(upload);
		sb.append(", pon=");
		sb.append(pon);
		sb.append(", valueofcommit=");
		sb.append(valueofcommit);
		sb.append(", rmethod=");
		sb.append(rmethod);
		sb.append(", rdate=");
		sb.append(rdate);
		sb.append(", pcdc=");
		sb.append(pcdc);
		sb.append(", onwhatbasis=");
		sb.append(onwhatbasis);
		sb.append(", recordproposedcourse=");
		sb.append(recordproposedcourse);
		sb.append(", comments=");
		sb.append(comments);
		sb.append(", currrentId=");
		sb.append(currrentId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public statusofsubmittedquote toEntityModel() {
		statusofsubmittedquoteImpl statusofsubmittedquoteImpl = new statusofsubmittedquoteImpl();

		statusofsubmittedquoteImpl.setSosqId(sosqId);

		if (sosq == null) {
			statusofsubmittedquoteImpl.setSosq(StringPool.BLANK);
		}
		else {
			statusofsubmittedquoteImpl.setSosq(sosq);
		}

		if (winprob == null) {
			statusofsubmittedquoteImpl.setWinprob(StringPool.BLANK);
		}
		else {
			statusofsubmittedquoteImpl.setWinprob(winprob);
		}

		if (aorderdate == null) {
			statusofsubmittedquoteImpl.setAorderdate(StringPool.BLANK);
		}
		else {
			statusofsubmittedquoteImpl.setAorderdate(aorderdate);
		}

		if (ppstartdate == null) {
			statusofsubmittedquoteImpl.setPpstartdate(StringPool.BLANK);
		}
		else {
			statusofsubmittedquoteImpl.setPpstartdate(ppstartdate);
		}

		if (ppenddate == null) {
			statusofsubmittedquoteImpl.setPpenddate(StringPool.BLANK);
		}
		else {
			statusofsubmittedquoteImpl.setPpenddate(ppenddate);
		}

		if (createDate == null) {
			statusofsubmittedquoteImpl.setCreateDate(StringPool.BLANK);
		}
		else {
			statusofsubmittedquoteImpl.setCreateDate(createDate);
		}

		if (customercomittype == null) {
			statusofsubmittedquoteImpl.setCustomercomittype(StringPool.BLANK);
		}
		else {
			statusofsubmittedquoteImpl.setCustomercomittype(customercomittype);
		}

		if (upload == null) {
			statusofsubmittedquoteImpl.setUpload(StringPool.BLANK);
		}
		else {
			statusofsubmittedquoteImpl.setUpload(upload);
		}

		statusofsubmittedquoteImpl.setPon(pon);
		statusofsubmittedquoteImpl.setValueofcommit(valueofcommit);

		if (rmethod == null) {
			statusofsubmittedquoteImpl.setRmethod(StringPool.BLANK);
		}
		else {
			statusofsubmittedquoteImpl.setRmethod(rmethod);
		}

		if (rdate == null) {
			statusofsubmittedquoteImpl.setRdate(StringPool.BLANK);
		}
		else {
			statusofsubmittedquoteImpl.setRdate(rdate);
		}

		if (pcdc == null) {
			statusofsubmittedquoteImpl.setPcdc(StringPool.BLANK);
		}
		else {
			statusofsubmittedquoteImpl.setPcdc(pcdc);
		}

		if (onwhatbasis == null) {
			statusofsubmittedquoteImpl.setOnwhatbasis(StringPool.BLANK);
		}
		else {
			statusofsubmittedquoteImpl.setOnwhatbasis(onwhatbasis);
		}

		if (recordproposedcourse == null) {
			statusofsubmittedquoteImpl.setRecordproposedcourse(StringPool.BLANK);
		}
		else {
			statusofsubmittedquoteImpl.setRecordproposedcourse(recordproposedcourse);
		}

		if (comments == null) {
			statusofsubmittedquoteImpl.setComments(StringPool.BLANK);
		}
		else {
			statusofsubmittedquoteImpl.setComments(comments);
		}

		statusofsubmittedquoteImpl.setCurrrentId(currrentId);

		statusofsubmittedquoteImpl.resetOriginalValues();

		return statusofsubmittedquoteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sosqId = objectInput.readLong();
		sosq = objectInput.readUTF();
		winprob = objectInput.readUTF();
		aorderdate = objectInput.readUTF();
		ppstartdate = objectInput.readUTF();
		ppenddate = objectInput.readUTF();
		createDate = objectInput.readUTF();
		customercomittype = objectInput.readUTF();
		upload = objectInput.readUTF();
		pon = objectInput.readLong();
		valueofcommit = objectInput.readLong();
		rmethod = objectInput.readUTF();
		rdate = objectInput.readUTF();
		pcdc = objectInput.readUTF();
		onwhatbasis = objectInput.readUTF();
		recordproposedcourse = objectInput.readUTF();
		comments = objectInput.readUTF();
		currrentId = objectInput.readInteger();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(sosqId);

		if (sosq == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sosq);
		}

		if (winprob == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(winprob);
		}

		if (aorderdate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(aorderdate);
		}

		if (ppstartdate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ppstartdate);
		}

		if (ppenddate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ppenddate);
		}

		if (createDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createDate);
		}

		if (customercomittype == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customercomittype);
		}

		if (upload == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(upload);
		}

		objectOutput.writeLong(pon);
		objectOutput.writeLong(valueofcommit);

		if (rmethod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rmethod);
		}

		if (rdate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rdate);
		}

		if (pcdc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(pcdc);
		}

		if (onwhatbasis == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(onwhatbasis);
		}

		if (recordproposedcourse == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(recordproposedcourse);
		}

		if (comments == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(comments);
		}

		objectOutput.writeInteger(currrentId);
	}

	public long sosqId;
	public String sosq;
	public String winprob;
	public String aorderdate;
	public String ppstartdate;
	public String ppenddate;
	public String createDate;
	public String customercomittype;
	public String upload;
	public long pon;
	public long valueofcommit;
	public String rmethod;
	public String rdate;
	public String pcdc;
	public String onwhatbasis;
	public String recordproposedcourse;
	public String comments;
	public Integer currrentId;
}