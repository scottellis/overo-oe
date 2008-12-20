require x-load.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/x-load-git/${MACHINE}"

SRCREV = "037a8ed45e9ecfffacfaab0b7a713fdde56d155a"

PV = "1.42+${PR}+git${SRCREV}"
PR="r13"
PE = "1"

SRC_URI = "git://www.sakoman.net/git/x-load-omap3.git;branch=master;protocol=git"

SRC_URI_append_beagleboard = " \
                              file://name.patch;patch=1 \
                              file://armv7-a.patch;patch=1 \
                             "

SRC_URI_append_omap3evm = " \
                              file://armv7-a.patch;patch=1 \
                             "

SRC_URI_append_overo = " \
                              file://armv7-a.patch;patch=1 \
                             "

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
