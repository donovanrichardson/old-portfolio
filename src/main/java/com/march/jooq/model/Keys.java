/*
 * This file is generated by jOOQ.
 */
package com.march.jooq.model;


import com.march.jooq.model.tables.Docs;
import com.march.jooq.model.tables.Langs;
import com.march.jooq.model.tables.Textstring;
import com.march.jooq.model.tables.Translations;
import com.march.jooq.model.tables.Words;
import com.march.jooq.model.tables.records.DocsRecord;
import com.march.jooq.model.tables.records.LangsRecord;
import com.march.jooq.model.tables.records.TextstringRecord;
import com.march.jooq.model.tables.records.TranslationsRecord;
import com.march.jooq.model.tables.records.WordsRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>lexicon</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<DocsRecord, Integer> IDENTITY_DOCS = Identities0.IDENTITY_DOCS;
    public static final Identity<LangsRecord, Integer> IDENTITY_LANGS = Identities0.IDENTITY_LANGS;
    public static final Identity<TextstringRecord, Integer> IDENTITY_TEXTSTRING = Identities0.IDENTITY_TEXTSTRING;
    public static final Identity<TranslationsRecord, Integer> IDENTITY_TRANSLATIONS = Identities0.IDENTITY_TRANSLATIONS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<DocsRecord> KEY_DOCS_PRIMARY = UniqueKeys0.KEY_DOCS_PRIMARY;
    public static final UniqueKey<DocsRecord> KEY_DOCS_DOC_REV = UniqueKeys0.KEY_DOCS_DOC_REV;
    public static final UniqueKey<LangsRecord> KEY_LANGS_PRIMARY = UniqueKeys0.KEY_LANGS_PRIMARY;
    public static final UniqueKey<LangsRecord> KEY_LANGS_LANG_NAME = UniqueKeys0.KEY_LANGS_LANG_NAME;
    public static final UniqueKey<TextstringRecord> KEY_TEXTSTRING_PRIMARY = UniqueKeys0.KEY_TEXTSTRING_PRIMARY;
    public static final UniqueKey<TranslationsRecord> KEY_TRANSLATIONS_PRIMARY = UniqueKeys0.KEY_TRANSLATIONS_PRIMARY;
    public static final UniqueKey<WordsRecord> KEY_WORDS_PRIMARY = UniqueKeys0.KEY_WORDS_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<TextstringRecord, WordsRecord> WORD_TEXTSTRING_FK = ForeignKeys0.WORD_TEXTSTRING_FK;
    public static final ForeignKey<TextstringRecord, DocsRecord> DOC_TEXTSTRING_FK = ForeignKeys0.DOC_TEXTSTRING_FK;
    public static final ForeignKey<TranslationsRecord, WordsRecord> FROM_WORD_TRANS_FK = ForeignKeys0.FROM_WORD_TRANS_FK;
    public static final ForeignKey<TranslationsRecord, LangsRecord> TO_LANG_TRANS_FK = ForeignKeys0.TO_LANG_TRANS_FK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<DocsRecord, Integer> IDENTITY_DOCS = Internal.createIdentity(Docs.DOCS, Docs.DOCS.DOC_ID);
        public static Identity<LangsRecord, Integer> IDENTITY_LANGS = Internal.createIdentity(Langs.LANGS, Langs.LANGS.LANG_ID);
        public static Identity<TextstringRecord, Integer> IDENTITY_TEXTSTRING = Internal.createIdentity(Textstring.TEXTSTRING, Textstring.TEXTSTRING.WORD_ID);
        public static Identity<TranslationsRecord, Integer> IDENTITY_TRANSLATIONS = Internal.createIdentity(Translations.TRANSLATIONS, Translations.TRANSLATIONS.TRANS_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<DocsRecord> KEY_DOCS_PRIMARY = Internal.createUniqueKey(Docs.DOCS, "KEY_docs_PRIMARY", Docs.DOCS.DOC_ID);
        public static final UniqueKey<DocsRecord> KEY_DOCS_DOC_REV = Internal.createUniqueKey(Docs.DOCS, "KEY_docs_doc_rev", Docs.DOCS.DOC_NAME, Docs.DOCS.REVISION);
        public static final UniqueKey<LangsRecord> KEY_LANGS_PRIMARY = Internal.createUniqueKey(Langs.LANGS, "KEY_langs_PRIMARY", Langs.LANGS.LANG_ID);
        public static final UniqueKey<LangsRecord> KEY_LANGS_LANG_NAME = Internal.createUniqueKey(Langs.LANGS, "KEY_langs_lang_name", Langs.LANGS.LANG_NAME);
        public static final UniqueKey<TextstringRecord> KEY_TEXTSTRING_PRIMARY = Internal.createUniqueKey(Textstring.TEXTSTRING, "KEY_textstring_PRIMARY", Textstring.TEXTSTRING.WORD_ID);
        public static final UniqueKey<TranslationsRecord> KEY_TRANSLATIONS_PRIMARY = Internal.createUniqueKey(Translations.TRANSLATIONS, "KEY_translations_PRIMARY", Translations.TRANSLATIONS.TRANS_ID);
        public static final UniqueKey<WordsRecord> KEY_WORDS_PRIMARY = Internal.createUniqueKey(Words.WORDS, "KEY_words_PRIMARY", Words.WORDS.WORD);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<TextstringRecord, WordsRecord> WORD_TEXTSTRING_FK = Internal.createForeignKey(com.march.jooq.model.Keys.KEY_WORDS_PRIMARY, Textstring.TEXTSTRING, "word_textstring_fk", Textstring.TEXTSTRING.WORD);
        public static final ForeignKey<TextstringRecord, DocsRecord> DOC_TEXTSTRING_FK = Internal.createForeignKey(com.march.jooq.model.Keys.KEY_DOCS_PRIMARY, Textstring.TEXTSTRING, "doc_textstring_fk", Textstring.TEXTSTRING.DOC_ID);
        public static final ForeignKey<TranslationsRecord, WordsRecord> FROM_WORD_TRANS_FK = Internal.createForeignKey(com.march.jooq.model.Keys.KEY_WORDS_PRIMARY, Translations.TRANSLATIONS, "from_word_trans_fk", Translations.TRANSLATIONS.FROM_WORD);
        public static final ForeignKey<TranslationsRecord, LangsRecord> TO_LANG_TRANS_FK = Internal.createForeignKey(com.march.jooq.model.Keys.KEY_LANGS_PRIMARY, Translations.TRANSLATIONS, "to_lang_trans_fk", Translations.TRANSLATIONS.TO_LANG);
    }
}
