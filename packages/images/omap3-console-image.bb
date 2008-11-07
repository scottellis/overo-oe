# console image for omap3

inherit image

DEPENDS = "task-base"

IMAGE_INSTALL += " \
  task-base-extended \
  task-proper-tools \
  bash \
  psplash \
  mtd-utils \
  mkfs-jffs2 \
  fbgrab \
  fbset \
  fbset-modes \
  socat \
  strace \
  ksymoops \
  alsa-utils \
  alsa-utils-alsactl \
  alsa-utils-alsamixer \
  alsa-utils-aplay \
#  libertas-sd-firmware \
  rt73-firmware \
  zd1211-firmware \
 "

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

#ROOTFS_POSTPROCESS_COMMAND += '${@base_conditional("DISTRO_TYPE", "release", "zap_root_password; ", "",d)}'


