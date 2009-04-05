DESCRIPTION = "xdg-utils: command line tools for desktop integration tasks"
LICENSE = "MIT"

DEPENDS = ""

PR = "r0"

SRC_URI = "http://portland.freedesktop.org/download/${PN}-${PV}.tgz"

EXTRA_OECONF = ""

S = "${WORKDIR}/${PN}-${PV}"
inherit autotools

