# X11 demo image for omap3

require omap3-console-image.bb

IMAGE_LINGUAS = "de-de fr-fr en-gb en-us pt-br es-es"

ANGSTROM_EXTRA_INSTALL ?= ""
SPLASH ?= "psplash"
#SPLASH ?= "exquisite exquisite-themes exquisite-theme-angstrom"

E_CONFIG = " \
  e-wm-config-angstrom \
  e-wm-config-illume \
  e-wm-config-standard \
  e-wm-config-netbook \
  e-wm-config-default \
  e-wm-config-minimalist \
  e-wm-config-scaleable \
"

E_MODULES = " \
  flame \
  news \
  places \
  rain \
"

APPS = " \
  abiword \
  cheese \
  claws-mail \
  evince \
  exhibit \
  ekiga \
  firefox \
  gimp \
  gnome-games \
  gnome-mplayer \
  gnumeric \
  gpe-soundbite \
  jaaa \
  midori \
  numptyphysics \
  pidgin \
  swfdec \
  swfdec-mozilla \
  synergy \
  vnc \
  x11vnc \
  angstrom-x11vnc-xinit \
  xmms \
  xterm \
"

IMAGE_INSTALL += " \
  ${APPS} \
  angstrom-x11-base-depends \
  angstrom-gpe-task-base \
  angstrom-gpe-task-settings \
  angstrom-zeroconf-audio \
  angstrom-gnome-icon-theme-enable \
  cups \
  e-wm \
  e-wm-sysactions \
  ${E_CONFIG} \
  ${E_MODULES} \
  hicolor-icon-theme \
  gnome-bluetooth \
  gnome-cups-manager \
  gnome-icon-theme \
  gnome-themes \
  gtk-printbackend-cups \
  mime-support \
  nautilus \
  ${SPLASH} \
  ${XSERVER} \
  xdg-utils \
  xlsfonts \
  xrefresh \
 "

IMAGE_INSTALL_append_beagleboard = " \
  libgles-omap3-demos \
 "

