# X11 factory image for omap3 -- trimmed down to fit nand

require omap3-console-image.bb

IMAGE_LINGUAS = "de-de fr-fr en-gb en-us es-es"

ANGSTROM_EXTRA_INSTALL ?= ""

SPLASH ?= "psplash"

APPS = " \
  abiword-meta \
  claws-mail \
  evince \
  gnome-games \
  gnome-mplayer \
  gnumeric \
  gpe-soundbite \
  midori \
  pidgin \
  vnc \
  x11vnc \
  angstrom-x11vnc-xinit \
  xmms \
  xterm \
 "

E_CONFIG = " \
  e-wm-config-angstrom \
  e-wm-config-angstrom-touchscreen \
  e-wm-config-angstrom-widescreen \
 "

E_MODULES = " \
  places \
 "

E17 = " \
  e-wm \
  e-wm-menu \
  e-wm-sysactions \
  entrance \
  ${E_CONFIG} \
  ${E_MODULES} \
 "

FONTS = " \
  ttf-dejavu-common \
  ttf-dejavu-sans \
  ttf-dejavu-serif \
  ttf-dejavu-sans-mono \
 "  

PRINT = " \
  cups \
  gnome-cups-manager \
  gtk-printbackend-cups \
 "

SETTINGS = " \
  networkmanager network-manager-applet \
  gnome-bluetooth \
  gpe-conf \
  gpe-package \
 "

XSERVER_BASE = " \
  ${XSERVER} \
  dbus-x11 \
  fontconfig-utils \
  gnome-icon-theme angstrom-gnome-icon-theme-enable \
  gnome-themes \
  gtk-theme-clearlooks \
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
  ${PRINT} \
  ${SETTINGS} \
  ${SPLASH} \
  ${XSERVER_BASE} \
 "

