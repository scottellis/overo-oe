# X11 image for omap3
require omap3-console-image.bb

RDEPENDS_append += " \
  task-qt4-x11-base \
  task-qt4-x11-qwt \
 "

IMAGE_LINGUAS = "en-us"

ANGSTROM_EXTRA_INSTALL ?= " \
  task-qt4-x11-base \
  task-qt4-x11-qwt \
  qmake2 \
  qt4-x11-free-gles-dev \
 "

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
#  gnome-icon-theme angstrom-gnome-icon-theme-enable \
#  gnome-themes \
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
  ${ANGSTROM_EXTRA_INSTALL} \
  ${E17} \
  ${FONTS} \
  ${SETTINGS} \
  ${SPLASH} \
  ${XSERVER_BASE} \
 "

