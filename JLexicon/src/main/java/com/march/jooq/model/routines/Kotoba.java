/*
 * This file is generated by jOOQ.
 */
package com.march.jooq.model.routines;


import com.march.jooq.model.Lexicon;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class Kotoba extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1735670585;

    /**
     * The parameter <code>lexicon.kotoba.one_word</code>.
     */
    public static final Parameter<String> ONE_WORD = createParameter("one_word", org.jooq.impl.SQLDataType.VARCHAR(100), false, false);

    /**
     * Create a new routine call instance
     */
    public Kotoba() {
        super("kotoba", Lexicon.LEXICON);

        addInParameter(ONE_WORD);
    }

    /**
     * Set the <code>one_word</code> parameter IN value to the routine
     */
    public void setOneWord(String value) {
        setValue(ONE_WORD, value);
    }
}
