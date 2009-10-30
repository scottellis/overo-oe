require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "4bc3d2afb380e78fdbb9c501d9a8da6d59eb178e"

PV = "2009.08+${PR}+git${SRCREV}"
PR = "r11"
PE = "1"

SRC_URI = "git://git.denx.de/u-boot-ti.git;protocol=git \
           file://fw_env.config \
           file://tincan.patch;patch=1 \
          "

S = "${WORKDIR}/git"

