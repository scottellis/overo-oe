# X11 demo image for Overo

PR = "r6"

inherit image

DEPENDS = "task-base"

IMAGE_INSTALL += " \
  ${XSERVER} \
  task-base-extended \
  task-proper-tools \
  psplash \
  mtd-utils \
  fbgrab \
  fbset \
  fbset-modes \
  socat \
  strace \
  ksymoops \
  iptables \
  alsa-utils \
  alsa-utils-alsactl \
  alsa-utils-alsamixer \
  alsa-utils-aplay \
  angstrom-x11-base-depends \
  angstrom-gpe-task-apps \
  angstrom-gpe-task-base \
  angstrom-gpe-task-game \
  angstrom-gpe-task-pim \
  angstrom-gpe-task-settings \
  angstrom-zeroconf-audio \
  gnome-games \
  pidgin \
  abiword \
  gnumeric \
  gimp \
  e-wm exhibit \
  hicolor-icon-theme gnome-icon-theme \
  firefox \
  epiphany \
  midori \
  swfdec-mozilla \
  mplayer \
  xmms \
  claws-mail \
  rt73-firmware zd1211-firmware \
  stalonetray \
 "

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

#ROOTFS_POSTPROCESS_COMMAND += '${@base_conditional("DISTRO_TYPE", "release", "zap_root_password; ", "",d)}'

XSERVER ?= "xserver-xorg \
           xf86-input-evdev \
           xf86-input-mouse \
           xf86-video-fbdev \
           xf86-input-keyboard \
"


