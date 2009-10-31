DESCRIPTION = "Eject allows removable media (typically a CD-ROM, floppy disk, tape, or JAZ or ZIP disk) to be ejected under software control."
LICENSE = "GPLv2"

inherit autotools gettext

SRC_URI = "ftp://ftp.eenet.ee/pub/gentoo/distfiles/eject-${PV}.tar.gz"

S = "${WORKDIR}/${PN}"

