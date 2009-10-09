require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "617da90c1dcf65428ddfb63fef897439950bc915"

PV = "2009.08+${PR}+git${SRCREV}"
PR = "r9"
PE = "1"

SRC_URI = "git://git.denx.de/u-boot-ti.git;protocol=git \
           file://fw_env.config \
           file://dss2.patch;patch=1 \
           file://rootfs.patch;patch=1 \
           file://tincan.patch;patch=1 \
           file://smc911x-autodetect.patch;patch=1 \
          "

S = "${WORKDIR}/git"

