# X11 demo image for omap3

require omap3-console-image.bb

XSERVER ?= "xserver-xorg \
           xf86-input-evdev \
           xf86-input-mouse \
           xf86-video-fbdev \
           xf86-input-keyboard \
"

IMAGE_INSTALL += " \
  angstrom-x11-base-depends \
  glibc-binary-localedata-en-us \
  glibc-binary-localedata-de-de \
  glibc-binary-localedata-fr-fr \
  angstrom-gpe-task-base \
  angstrom-gpe-task-settings \
  angstrom-zeroconf-audio \
  angstrom-gnome-icon-theme-enable \
  e-wm \
  e-wm-config-illume \
  e-wm-config-standard \
  e-wm-config-netbook \
  e-wm-config-minimalist \
  e-wm-config-scaleable \
  hicolor-icon-theme \
  gnome-icon-theme \
  gnome-mplayer \
  gnome-games \
  pidgin \
  abiword \
  gnumeric \
  exhibit \
  gimp \
  firefox \
  midori \
  swfdec-mozilla \
  xmms \
  claws-mail \
  synergy \
  vnc \
  x11vnc \
 "
