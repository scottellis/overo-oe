require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

SRCREV = "b7038cff739684bb95853eb5bee924c2574a222e"

PV = "2008.10+${PR}+git${SRCREV}"
PR="r14"
PE = "1"

SRC_URI = "git://www.sakoman.net/git/u-boot-omap3.git;branch=omap3-dev;protocol=git \
          "

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
