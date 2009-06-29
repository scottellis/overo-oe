DESCRIPTION = "Icecast source client"
LICENSE = "GPLv2"

DEPENDS = "libvorbis libogg libxml2 libshout"

PR = "r1"

SRC_URI = "http://downloads.us.xiph.org/releases/ices/ices-${PV}.tar.gz"

EXTRA_OECONF = "--with-ogg=${STAGING_LIBDIR} --with-vorbis=${STAGING_LIBDIR}"

S = "${WORKDIR}/ices-${PV}"
inherit autotools

