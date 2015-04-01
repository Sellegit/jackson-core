package com.fasterxml.jackson.core.util;


import com.fasterxml.jackson.core.JsonGenerator;

import java.io.IOException;

/**
 * Dummy implementation that adds no indentation whatsoever
 */
public class NopIndenter
    implements DefaultPrettyPrinter.Indenter, java.io.Serializable
{
    public static final NopIndenter instance = new NopIndenter();

    @Override
    public void writeIndentation(JsonGenerator jg, int level) throws IOException { }

    @Override
    public boolean isInline() { return true; }
}
