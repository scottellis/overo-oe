require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "1e4e5ef0469050f014aee1204dae8a9ab6053e49"

PV = "2010.9+${PR}+git${SRCREV}"
PR = "r1"

SRC_URI = "git://git.denx.de/u-boot.git;branch=master;protocol=git \
	   file://expansion.patch \
           file://overo-gpio10.patch \
           file://mcbsp3-mux.patch \
          "

S = "${WORKDIR}/git"

