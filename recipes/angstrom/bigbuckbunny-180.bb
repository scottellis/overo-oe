DESCRIPTION = "Big Buck Bunny movie"
LICENSE = "CC-BY"

SRC_URI = "http://download.blender.org/peach/bigbuckbunny_movies/BigBuckBunny_320x180.mp4"

do_install() {
	install -d ${D}${datadir}/movies
	install -m 0644 ${WORKDIR}/BigBuckBunny_320x180.mp4 ${D}${datadir}/movies/ 
}

FILES_${PN} += "${datadir}/movies"
PACKAGE_ARCH = "all"

