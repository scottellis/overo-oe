DESCRIPTION = "OBEX Server and Client"
DEPENDS = "openobex glib-2.0 dbus bluez4 libical"

LICENSE = "GPLv2"

PR = "r1"

SRC_URI = "http://www.kernel.org/pub/linux/bluetooth/obexd-${PV}.tar.gz"
SRC_URI[md5sum] = "36080a767e63e54878cd6bcfb20c4f3b"
SRC_URI[sha256sum] = "f99fb58562a3d7edef6fd9e63ca04510e241bbdab37fdb122c2c7a112a09100a"

inherit autotools

FILES_${PN} += "${datadir}/dbus-1/"
