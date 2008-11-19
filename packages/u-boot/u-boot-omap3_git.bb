require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

SRCREV = "58d8d92b74d1fb1c34899f0d9e2e7e4128eb1958"

PV = "2008.10+${PR}+git${SRCREV}"
PR="r8"
PE = "1"

SRC_URI = "git://www.sakoman.net/git/u-boot-omap3.git;branch=omap3;protocol=git \
          "

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
