require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "35e1a9b87750483027f1114364d7980d71cd936d"

PV = "2009.08+${PR}+git${SRCREV}"
PR = "r6"
PE = "1"

SRC_URI = "git://git.denx.de/u-boot-ti.git;protocol=git \
           file://fw-env.config \
           file://dss2.patch;patch=1 \
           file://tincan.patch;patch=1 \
           file://smsc911x.patch;patch=1 \
           file://rootfs.patch;patch=1 \
          "

S = "${WORKDIR}/git"

