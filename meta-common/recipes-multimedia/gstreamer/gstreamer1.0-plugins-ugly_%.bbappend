#FILESEXTRAPATHS_prepend := "${THISDIR}/networkmanager"

# Include x264enc in case you want it.  Ideally I want VP9 in the .webm
# container (.webm is a subset of matroska IIRC), though.
PACKAGECONFIG_append = " x264"
