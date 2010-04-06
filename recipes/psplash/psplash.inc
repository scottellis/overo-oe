DESCRIPTION = "Userspace framebuffer boot logo based on usplash."
HOMEPAGE = "http://projects.o-hand.com/psplash"
SECTION = "base"
LICENSE = "GPL"
RDEPENDS = "initscripts"
PROVIDES = "virtual/psplash"
RPROVIDES_${PN} = "virtual-psplash"
RCONFLICTS_${PN} = "exquisite"

SRCREV = "249"
PV = "0.0+svnr${SRCREV}"
PR = "r24"

PSPLASH_HAND ?= "psplash-hand-img.h"
PSPLASH_BAR ?= "psplash-bar-img.h"
PSPLASH_H ?= "psplash.h"

# You can create your own pslash-hand-img.h by doing
# ./make-image-header.sh <file>.png HAND
# and rename the resulting .h to pslash-hand-img.h (for the logo)
# respectively psplash-bar-img.h (BAR) for the bar.
# You might also want to patch the colors (see patch)

inherit autotools pkgconfig update-rc.d

do_configure_append() {
	install -m 0644 ${WORKDIR}/${PSPLASH_HAND} ${S}/psplash-hand-img.h
	install -m 0644 ${WORKDIR}/${PSPLASH_BAR} ${S}/psplash-bar-img.h

	if [ -e "${WORKDIR}/${PSPLASH_H}" ]; then
		install -m 0644 ${WORKDIR}/${PSPLASH_H} ${S}/psplash.h
	fi
}

do_install_prepend() {
	install -d ${D}/mnt/.splash/
	install -d ${D}${sysconfdir}/default/
	install -m 0644 ${WORKDIR}/psplash-default ${D}${sysconfdir}/default/psplash
	install -d ${D}${sysconfdir}/init.d/
	install -m 0755 ${WORKDIR}/psplash-init ${D}${sysconfdir}/init.d/psplash
	install -d ${D}${bindir}
	ln -s psplash-write ${D}${bindir}/splash-write
	install -d ${D}${sysconfdir}/default
	install -m 0755 ${WORKDIR}/splashfuncs ${D}${sysconfdir}/default/splashfuncs
}

INITSCRIPT_NAME = "psplash"
INITSCRIPT_PARAMS = "start 01 S . stop 20 0 1 6 ."

PACKAGES =+ "psplash-support"

RDEPENDS_${PN} += "psplash-support"
FILES_psplash-support += "/mnt/.splash ${sysconfdir} ${bindir}/psplash-write ${bindir}/splash-write"
