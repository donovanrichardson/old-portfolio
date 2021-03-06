/*
 * This file is generated by jOOQ.
 */
package com.novemb.jooq.model.tables.records;


import com.novemb.jooq.model.tables.Job;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobRecord extends UpdatableRecordImpl<JobRecord> implements Record5<UInteger, String, String, String, String> {

    private static final long serialVersionUID = 507588909;

    /**
     * Setter for <code>jobs.job.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>jobs.job.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>jobs.job.job_name</code>.
     */
    public void setJobName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jobs.job.job_name</code>.
     */
    public String getJobName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jobs.job.location_name</code>.
     */
    public void setLocationName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jobs.job.location_name</code>.
     */
    public String getLocationName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jobs.job.url</code>.
     */
    public void setUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>jobs.job.url</code>.
     */
    public String getUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jobs.job.company</code>.
     */
    public void setCompany(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>jobs.job.company</code>.
     */
    public String getCompany() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UInteger, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UInteger, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return Job.JOB.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Job.JOB.JOB_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Job.JOB.LOCATION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Job.JOB.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Job.JOB.COMPANY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getJobName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLocationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCompany();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getJobName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLocationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCompany();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value2(String value) {
        setJobName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value3(String value) {
        setLocationName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value4(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value5(String value) {
        setCompany(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord values(UInteger value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JobRecord
     */
    public JobRecord() {
        super(Job.JOB);
    }

    /**
     * Create a detached, initialised JobRecord
     */
    public JobRecord(UInteger id, String jobName, String locationName, String url, String company) {
        super(Job.JOB);

        set(0, id);
        set(1, jobName);
        set(2, locationName);
        set(3, url);
        set(4, company);
    }
}
