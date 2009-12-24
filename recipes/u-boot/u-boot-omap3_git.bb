require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "87d93a1ba2ae23550e1370adb7a3b00af0831165"

PV = "2009.11+${PR}+git${SRCREV}"
PR = "r0"
PE = "1"

SRC_URI = "git://git.denx.de/u-boot.git;protocol=git \
           file://fw_env.config \
           file://tincan.patch;patch=1 \
          "

S = "${WORKDIR}/git"

