# X11 image for omap3

require omap3-console-image.bb

RDEPENDS_append += " \
  qt4-embedded \
  task-sdk-native \
  "

IMAGE_LINGUAS = "en-us"

ANGSTROM_EXTRA_INSTALL ?= ""

SPLASH ?= "psplash"

APPS = " \
  mplayer \
  mplayer-common \
#  vnc \
#  x11vnc \
#  angstrom-x11vnc-xinit \
  xterm \
 "

DEV_TOOLS = " \
  gcc \
  g++ \
  gcc-symlinks \
  g++-symlinks \
  cpp \
  cpp-symlinks \
  binutils-symlinks \
  make \
  virtual-libc-dev \
  task-proper-tools \
  perl-modules \
  flex \
  flex-dev \
  bison \
  gawk \
  sed \
  grep \
  autoconf \
  automake \
  make \
#  cmake \
  patch \
  patchutils \
  diffstat \
  diffutils \
  libstdc++-dev \
  libtool \
  libtool-dev \
  libltdl-dev \
  pkgconfig \
 "

QTE_INSTALL = " \
  libqt-embedded3support4 \
  libqt-embeddedclucene4 \
  libqt-embeddedcore4 \
  libqt-embeddeddbus4 \
  libqt-embeddedgui4 \
  libqt-embeddedhelp4 \
  libqt-embeddedmultimedia4 \
  libqt-embeddednetwork4 \
  libqt-embeddedscript4 \
  libqt-embeddedscripttools4 \
  libqt-embeddedsql4 \
  libqt-embeddedsvg4 \
  libqt-embeddedtest4 \
  libqt-embeddedwebkit4 \
  libqt-embeddedxml4 \
#	libqt-embeddedxmlpatterns4 \
  qt4-embedded-fonts-ttf-dejavu \
  qt4-embedded-fonts-ttf-vera \
  qt4-embedded-plugin-iconengine-svgicon \
  qt4-embedded-plugin-imageformat-gif \
  qt4-embedded-plugin-imageformat-ico \
  qt4-embedded-plugin-imageformat-jpeg \
  qt4-embedded-plugin-imageformat-mng \
  qt4-embedded-plugin-imageformat-svg \
  qt4-embedded-plugin-imageformat-tiff \
  qt4-embedded-plugin-mousedriver-tslib \
  qt4-embedded-plugin-phonon-backend-gstreamer \
  qt4-embedded-plugin-script-dbus \
  qt4-embedded-plugin-sqldriver-sqlite2 \
  qt4-embedded-plugin-sqldriver-sqlite \
  "

E_CONFIG = " \
  e-wm-config-angstrom \
 "

E_MODULES = " \
  places \
 "

E17 = " \
  e-wm \
  e-wm-menu \
  e-wm-sysactions \
  ${E_CONFIG} \
  ${E_MODULES} \
 "

FONTS = " \
  ttf-dejavu-common \
  ttf-dejavu-sans \
  ttf-dejavu-serif \
  ttf-dejavu-sans-mono \
 "  

SETTINGS = " \
#  networkmanager network-manager-applet networkmanager-openvpn \
#  gnome-bluetooth \
  gpe-conf \
#  gpe-package \
 "

XSERVER_BASE = " \
  ${XSERVER} \
  dbus-x11 \
  fontconfig-utils \
  gnome-icon-theme angstrom-gnome-icon-theme-enable \
  gnome-themes \
  gpe-theme-clearlooks \
  gtk-engine-clearlooks \
  gpe-dm \
  gpe-session-scripts \
  hicolor-icon-theme \
  mime-support \
  xauth \
  xdg-utils \
  xhost \
  xset \
  xlsfonts \
  xrefresh \
 "

IMAGE_INSTALL += " \
  ${APPS} \
  ${DEV_TOOLS} \
  ${QTE_INSTALL} \
  ${E17} \
  ${FONTS} \
  ${SETTINGS} \
  ${SPLASH} \
  ${XSERVER_BASE} \
 "

