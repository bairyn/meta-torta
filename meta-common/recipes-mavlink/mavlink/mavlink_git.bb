# Based on meta-uav's recipe, but updated.
SUMMARY = "MAVLink micro air vehicle marshalling / communication library"
HOMEPAGE = "https://github.com/ArduPilot/mavlink"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

PV = "1.0.9"
SRCREV = "6f036bf295dfd54d7da32262049c4feef2c6a595"
SRC_URI = "git://github.com/mavlink/mavlink.git \
          "

S = "${WORKDIR}/git"

inherit cmake pythonnative

PARALLEL_MAKE = ""
OECMAKE_SOURCEPATH = "${S}"
OECMAKE_BUILDPATH = "${S}/build-${TARGET_ARCH}-${PV}"

FILES_${PN} += "${datadir}/pyshared"
