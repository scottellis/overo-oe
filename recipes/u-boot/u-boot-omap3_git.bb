require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "92222b9a44bcf117499f4d48409687cf9c6ebd0d"

PV = "2009.11.1+${PR}+git${SRCREV}"
PR = "r0"

SRC_URI = "git://www.sakoman.com/git/u-boot.git;branch=omap3-v2009.11.1;protocol=git \
           file://fw_env.config \
           file://mcbsp3-mux.patch;apply=yes \
           file://ads127x-control-mux.patch;apply=yes \
          "

S = "${WORKDIR}/git"

