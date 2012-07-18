# Minimal X11 image for amber optix testing
#

require amber-optix-console-image.bb

IMAGE_LINGUAS = "en-gb"

TI_DSP_GUI_INSTALL = " \
  gst-plugin-xvimagesink \
 "

APPS = " \
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

E17 = " \
  e-wm \
  e-wm-menu \
  e-wm-sysactions \
  ${E_CONFIG} \
 "

FONTS = " \
  ttf-dejavu-common \
  ttf-dejavu-sans \
  ttf-dejavu-serif \
  ttf-dejavu-sans-mono \
 "  

SETTINGS = " \
  gpe-conf \
 "

XSERVER_BASE = " \
  ${XSERVER} \
  dbus-x11 \
  fontconfig-utils \
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
  ${TI_DSP_GUI_INSTALL} \
  ${APPS} \
  ${E17} \
  ${FONTS} \
  ${SETTINGS} \
  ${SPLASH} \
  ${XSERVER_BASE} \
 "

export IMAGE_BASENAME = "amber-optix-desktop-image"

