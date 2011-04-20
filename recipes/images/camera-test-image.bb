# X11 demo image for omap3

require omap3-console-image.bb

IMAGE_LINGUAS = "en-us"

ANGSTROM_EXTRA_INSTALL ?= " \
   task-sdk-native \
   opencv-dev \
   task-gstreamer-ti \
   gnome-vfs-plugin-http \
   gnome-vfs-plugin-ftp \
   gnome-vfs-plugin-sftp \
   ti-codec-engine \
   ti-dmai \
   ti-dspbios \
   ti-dsplib \
   ti-dsplink \
#   ti-dvsdk-demos \
 "

SPLASH ?= "psplash"
#SPLASH ?= "exquisite exquisite-themes exquisite-theme-angstrom"

APPS = " \
#  cheese \
#  gnome-mplayer \
#  gpe-scap \
#  libgles-omap3-x11demos \
#  vnc \
#  x11vnc \
#  angstrom-x11vnc-xinit \
  xterm \
  vlc \
 "

E_CONFIG = " \
  e-wm-config-angstrom \
  e-wm-config-angstrom-widescreen \
  e-wm-config-illume \
  e-wm-config-standard \
  e-wm-config-netbook \
  e-wm-config-default \
  e-wm-config-minimalist \
  e-wm-config-scaleable \
 "

#E_MODULES = " \
#  news \
#  places \
# "

E17 = " \
  e-wm \
  e-wm-menu \
  e-wm-sysactions \
  ${E_CONFIG} \
#  ${E_MODULES} \
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
  ${E17} \
  ${FONTS} \
  ${SETTINGS} \
  ${SPLASH} \
  ${XSERVER_BASE} \
  ${ANGSTROM_EXTRA_INSTALL} \
 "

