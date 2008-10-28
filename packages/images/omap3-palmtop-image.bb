# gpe image for omap3 machines with lcd/touchscreen + midori

inherit image
PR = "r3"

IMAGE_INSTALL += " \
  task-base-extended \
  mtd-utils \
  fbgrab \
  fbset \
  fbset-modes \
  tar \
  mplayer \
  angstrom-gpe-task-apps \
  angstrom-gpe-task-base \
  angstrom-gpe-task-game \
  angstrom-gpe-task-pim \
  angstrom-gpe-task-settings \
  angstrom-x11-base-depends \
  midori \
  alsa-utils \
  alsa-utils-alsactl \
  alsa-utils-alsamixer \
  alsa-utils-aplay \
  xmms \
 "

#ROOTFS_POSTPROCESS_COMMAND += '${@base_conditional("DISTRO_TYPE", "release", "zap_root_password; ", "",d)}'

