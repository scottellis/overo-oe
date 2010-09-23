require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "07517e7f4f582d1607adbc444bab75af3ac4a7f9"

PV = "2010.9+${PR}+git${SRCREV}"
PR = "r0"

SRC_URI = "git://git.denx.de/u-boot.git;branch=master;protocol=git \
          "

S = "${WORKDIR}/git"

