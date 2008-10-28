# console image for omap3

PR = "r0"

inherit image

DEPENDS = "task-base"

IMAGE_INSTALL += " \
  task-base-extended \
  task-proper-tools \
  psplash \
  coreutils \
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
 "

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

#ROOTFS_POSTPROCESS_COMMAND += '${@base_conditional("DISTRO_TYPE", "release", "zap_root_password; ", "",d)}'


