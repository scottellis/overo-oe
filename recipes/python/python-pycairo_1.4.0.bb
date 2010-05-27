DESCRIPTION = "Python Bindings for the Cairo canvas library"
SECTION = "devel/python"
HOMEPAGE = "http://cairographics.org/pycairo"
LICENSE = "LGPL MPL"
DEPENDS = "cairo"
PR = "ml4"

SRC_URI = "http://cairographics.org/releases/pycairo-${PV}.tar.gz \
           file://fix-setup-py.patch"
S = "${WORKDIR}/pycairo-${PV}"

inherit distutils pkgconfig

do_configure_append() {
	sed -e 's:@prefix@:${prefix}:' -e 's:@includedir@:\$\{prefix\}/include:' -e 's:@VERSION@:${PV}:' pycairo.pc.in > pycairo.pc
}

do_install_append() {
	install -d ${STAGING_INCDIR}/pycairo
	install -m 0644 cairo/pycairo.h ${STAGING_INCDIR}/pycairo
}

SRC_URI[md5sum] = "e26e77919b606113f565d70036c1f504"
SRC_URI[sha256sum] = "9212afffee727e39ae99406b5a59ab3248556bcfebfae24d8278313678147e32"
