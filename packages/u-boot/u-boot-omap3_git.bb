require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

SRCREV = "932f9ccae24a802444289abec03f8d3b53b5b187"

PV = "2008.10+${PR}+git${SRCREV}"
PR="r9"
PE = "1"

SRC_URI = "git://www.sakoman.net/git/u-boot-omap3.git;branch=omap3;protocol=git \
          "

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
