require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "060955e39770b68b3cc0516b3641ca98e58d2d4a"

PV = "2009.08+${PR}+git${SRCREV}"
PR = "r10"
PE = "1"

SRC_URI = "git://git.denx.de/u-boot-ti.git;protocol=git \
           file://fw_env.config \
           file://tincan.patch;patch=1 \
          "

S = "${WORKDIR}/git"

