package com.fasterxml.jackson.core.util;

/**
 * @deprecated Since 2.5 use {@link DefaultIndenter} instead
 */
@Deprecated
public class Lf2SpacesIndenter extends DefaultIndenter
{
    /**
     * @deprecated Use {@link DefaultIndenter#SYSTEM_LINEFEED_INSTANCE} instead.
     */
    @SuppressWarnings("hiding")
    @Deprecated
    public static final Lf2SpacesIndenter instance = new Lf2SpacesIndenter();

    /**
     * @deprecated Use {@code new DefaultIndenter("  ", DefaultIndenter.SYS_LF)} instead
     */
    @Deprecated
    public Lf2SpacesIndenter() {
        super("  ", DefaultIndenter.SYS_LF);
    }

    /**
     * @deprecated Use {@code new DefaultIndenter("  ", lf)} instead
     */
    @Deprecated
    public Lf2SpacesIndenter(String lf) {
        super("  ", lf);
    }

    /**
     * Note: method was accidentally missing from 2.5.0; put back for 2.5.1 and
     * later 2.5.x versions.
     */
    @Override
    public Lf2SpacesIndenter withLinefeed(String lf) {
        if (lf.equals(getEol())) {
            return this;
        }
        return new Lf2SpacesIndenter(lf);
    }
}