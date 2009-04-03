DESCRIPTION = "USB mode switch utility"
LICENSE = "GPLv2"

DEPENDS = "libusb"

PR = "r0"

SRC_URI = "http://www.draisberghof.de/usb_modeswitch/usb_modeswitch-${PV}.tar.bz2"

S = "${WORKDIR}/usb_modeswitch-${PV}"

do_compile () {
    ${CC} ${CFLAGS} ${LDFLAGS} -o usb_modeswitch usb_modeswitch.c -lusb
}

do_install () {
    install -d ${D}${bindir}/
    install -m 0755 ${S}/usb_modeswitch ${D}${bindir}/
    install -d ${D}${sysconfdir}/
    install -m 0755 ${S}/usb_modeswitch.conf ${D}${sysconfdir}/
}

