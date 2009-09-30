require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "9dda55de23eee6cdd0a53daad0a552700f313f4c"

PV = "2009.08+${PR}+git${SRCREV}"
PR = "r8"
PE = "1"

SRC_URI = "git://git.denx.de/u-boot-ti.git;protocol=git \
           file://fw-env.config \
           file://tincan.patch;patch=1 \
          "

S = "${WORKDIR}/git"

