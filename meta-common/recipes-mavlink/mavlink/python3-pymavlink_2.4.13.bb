DESCRIPTION = "pymavlink"
HOMEPAGE = "http://github.com/ArduPilot/pymavlink"
LICENSE = "GPL-3.0"
#LIC_FILES_CHKSUM = "file://COPYING;md5=ffeffa59c90c9c4a033c7574f8f3fb75"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=918779d48d7661637da2632142db6852"

SRC_URI[sha256sum] = "c09e285d049590fd76ef72bc19b4597bef80712e942b3a507ef1521b432d84cd"

PYPI_PACKAGE = "pymavlink"
inherit pypi setuptools3

RDEPENDS_${PN} += " \
	${PYTHON_PN}-lxml \
	${PYTHON_PN}-future \
"

BBCLASSEXTEND = "native nativesdk"

DEPENDS += "python3-future-native"
