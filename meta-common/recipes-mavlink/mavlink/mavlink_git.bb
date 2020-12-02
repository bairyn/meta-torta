# Based on meta-uav's recipe, but updated.
SUMMARY = "MAVLink micro air vehicle marshalling / communication library"
HOMEPAGE = "https://github.com/ArduPilot/mavlink"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=54ad3cbe91bebcf6b1823970ff1fb97f"

PV = "1.0.9"
SRCREV = "6f036bf295dfd54d7da32262049c4feef2c6a595"
SRC_URI = "gitsm://github.com/ArduPilot/mavlink.git \
          "

S = "${WORKDIR}/git"

inherit cmake python3native

#PARALLEL_MAKE = ""
#OECMAKE_SOURCEPATH = "${S}"
#OECMAKE_BUILDPATH = "${S}/build-${TARGET_ARCH}-${PV}"

FILES_${PN} += "${datadir}/pyshared"

DEPENDS += "python3-future-native"

FILES_${PN} += " \
	${libdir}/python3.8/site-packages/pymavlink \
"

do_install_append() {
	rm -rf -- "${D}/../image/home"
}

ALLOW_EMPTY_${PN} = "1"
