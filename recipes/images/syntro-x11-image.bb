# Custom X11 image with python

require syntro-console-image.bb

IMAGE_LINGUAS = "en-us"

ANGSTROM_EXTRA_INSTALL ?= " "

SPLASH ?= "psplash"


E17 = " \
  e-wm \
  e-wm-config-minimalist \
 "

FONTS = " \
  ttf-dejavu-common \
  ttf-dejavu-sans \
  ttf-dejavu-serif \
  ttf-dejavu-sans-mono \
 "  


XSERVER_BASE = " \
  ${XSERVER} \
  dbus-x11 \
  fontconfig-utils \
  gpe-theme-clearlooks \
  gtk-engine-clearlooks \
  gpe-dm \
  gpe-session-scripts \
  xauth \
  xhost \
  xset \
  xrefresh \
 "

IMAGE_INSTALL += " \
  ${E17} \
  ${FONTS} \
  ${SPLASH} \
  ${XSERVER_BASE} \
 "

export IMAGE_BASENAME = "syntro-x11-image"


