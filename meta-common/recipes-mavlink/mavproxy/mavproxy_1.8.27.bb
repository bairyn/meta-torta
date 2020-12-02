DESCRIPTION = "MAVProxy"
HOMEPAGE = "http://github.com/ArduPilot/MAVProxy"
LICENSE = "GPL-3.0"
#LIC_FILES_CHKSUM = "file://COPYING.txt;md5=ffeffa59c90c9c4a033c7574f8f3fb75"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=3c34afdc3adf82d2448f12715a255122"

SRC_URI = "git://github.com/ArduPilot/MAVProxy"

SRCREV = "be727c4b829b4369b5f65232a837bae1d5296081"

#SRC_URI[md5sum] = "43fd756864fe42063068e092e220c57b"
#SRC_URI[sha256sum] = "29872e92839765e546828bb7754a68c418d927cd064fd4708fab9fe9c8bb116b"

#PYPI_PACKAGE = "mavproxy"
#inherit pypi setuptools3
inherit setuptools3

S = "${WORKDIR}/git"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-pymavlink \
	${PYTHON_PN}-pyserial \
"

#BBCLASSEXTEND = "native nativesdk"
