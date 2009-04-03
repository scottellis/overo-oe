require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

SRCREV = "fb479d0418bc7c15d63a131beedbc6f1970fc295"

PR="r1"

SRC_URI = "git://www.sakoman.net/git/u-boot-omap3.git;branch=common;protocol=git \
          "
S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
