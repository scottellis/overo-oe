  psp-2.6.32
=======

This branch is for mt9p031 camera support with the linux-omap-psp-2.6.32 kernel.

You can pull this tree into your existing overo-oe repository this way.

	cd ${OVEROTOP}/org.openembedded.dev
	git remote add -f jumpnow git://github.com/scottellis/overo-oe.git
	git checkout -b 2.6.32-psp jumpnow/2.6.32-psp
	git branch -a
	* 2.6.32-psp
	org.openembedded.dev
	overo
	remotes/origin/HEAD -> origin/org.openembedded.dev
	remotes/origin/org.openembedded.dev
	remotes/origin/overo
	remotes/jumpnow/minimal
	...


And build it like this.

	cd ${OVEROTOP}
	bitbake -c clean virtual/kernel; bitbake virtual/kernel; bitbake omap3-console-image


Don't expect it to work yet ;-)
