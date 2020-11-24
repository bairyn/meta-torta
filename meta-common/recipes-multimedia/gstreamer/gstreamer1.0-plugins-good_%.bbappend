#FILESEXTRAPATHS_prepend := "${THISDIR}/networkmanager"

# These are already included:
#PACKAGECONFIG_append = " flac jpeg lame libpng v4l2"
# Add vpx (c.f. gst-inspect-1.0 vpx).
PACKAGECONFIG_append = " vpx"

# Get aasink.
# I don't see an aalib (or libaa) recipe in my sources, though.
#PACKAGECONFIG_append = " aalib"
#EXTRA_OECONF_remove = "--disable-aalib"
#PACKAGECONFIG[aalib] = "--with-aalib,--disable-aalib,aalib"
