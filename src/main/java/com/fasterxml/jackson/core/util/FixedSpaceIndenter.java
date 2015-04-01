package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;

import java.io.IOException;

/**
 * This is a very simple indenter that only adds a
 * single space for indentation. It is used as the default
 * indenter for array values.
 */
public class FixedSpaceIndenter extends NopIndenter
{
    @SuppressWarnings("hiding")
    public static final FixedSpaceIndenter instance = new FixedSpaceIndenter();

    @Override
    public void writeIndentation(JsonGenerator jg, int level) throws IOException
    {
        jg.writeRaw(' ');
    }

    @Override
    public boolean isInline() { return true; }
}

